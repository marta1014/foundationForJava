package com.ATM;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<AccountItem> accounts = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("==================ATM system==================");
            System.out.println("1. 账户开户");
            System.out.println("2. 账户登录");



            System.out.println("请选择对应操作");
            int command = s.nextInt();

            switch (command) {
                case 1 -> register(accounts, s);
                case 2 -> login(accounts, s);
                default -> System.out.println("选择的操作有误，请重新输入");
            }
        }


    }

    private static void login(ArrayList<AccountItem> accounts, Scanner s) {
        System.out.println("===============系统登录操作================");

        if(accounts.size() == 0) {
            System.out.println("暂无账户可操作，请开户后重试～");
            return;
        }

        while (true) {
            System.out.println("请输入卡号～");
            String no = s.next();
            AccountItem item = getAccountById(no,accounts);
            if(item != null) {
                while (true) {
                    System.out.println("请输入账户密码");
                    String pwd = s.next();
                    if(pwd.equals(item.getPassword())) {
                        System.out.println("恭喜你" + item.getUserName() + "进入该系统，您的卡号是：" + item.getCardId());
                        showUserCommand(s,item,accounts);
                        return; // 杀死登录方法
                    } else {
                        System.out.println("密码有误，请重新输入！");
                    }
                }
            } else {
                System.out.println("账户不存在，请重新输入！");
            }
        }
    }

    private static void showUserCommand(Scanner scanner,AccountItem loginAccount,ArrayList<AccountItem> accounts) {
        while (true) {
            System.out.println("=================操作页====================");
            System.out.println("1. 查询账户");
            System.out.println("2. 存款");
            System.out.println("3. 取款");
            System.out.println("4. 转账");
            System.out.println("5. 修改密码");
            System.out.println("6. 退出");
            System.out.println("7. 注销账户");
            System.out.println("请选择对应操作");
            int command = scanner.nextInt();
            switch (command) {
                case 1 -> showCurrentLoginAccount(loginAccount);
                case 2 -> depositMoney(loginAccount, scanner);
                case 3 -> drawMoney(loginAccount, scanner);
                case 4 -> remittance(loginAccount, scanner,accounts);
                case 5 -> changePwd(loginAccount, scanner);
                case 6 -> {
                    System.out.println("退出成功");
                    return; // 停止当前方法
                }
                case 7 -> {
                    if(cancelAccount(loginAccount, scanner,accounts)) {
                        return;
                    } else {
                        break;
                    }
                }
            }
        }
    }

    private static Boolean cancelAccount(AccountItem loginAccount, Scanner scanner,ArrayList<AccountItem> accounts) {
        Boolean mark = false;
        while (true) {
            System.out.println("输入卡号");
            String idCard = scanner.next();
            System.out.println("输入密码");
            String pwd = scanner.next();
            if(idCard.equals(loginAccount.getCardId()) && pwd.equals(loginAccount.getPassword())) {
                System.out.println("successful cancel current account");
                accounts.remove(loginAccount);
                mark =  true;
                break;
            } else {
                mark =  false;
                System.out.println("输入项有误，请重新输入");
            }
        }
        return mark;
    }

    private static void changePwd(AccountItem loginAccount, Scanner scanner) {
        while (true) {
            System.out.println("输入初始密码");
            String initialPwd = scanner.next();
            if(loginAccount.getPassword().equals(initialPwd)) {
                System.out.println("输入新密码");
                String CurrentPwd = scanner.next();
                loginAccount.setPassword(CurrentPwd);
                System.out.println("修改密码成功，当前密码为：" + loginAccount.getPassword());
                return;
            } else {
                System.out.println("初始密码错误");
            }
        }
    }

    private static void remittance(AccountItem loginAccount, Scanner scanner,ArrayList<AccountItem> accounts) {
        if(accounts.size() < 2) {
            System.out.println("ERROR account size < 2");
            return;
        }
        if(loginAccount.getMoney() < 0) {
            System.out.println("ERROR loginAccount.getMoney() < 0");
            return;
        }
        while (true) {
            System.out.println("转入账户卡号");
            String othersAccountId = scanner.next();
            AccountItem accountItem = getAccountById(othersAccountId,accounts);
            if(loginAccount.getCardId().equals(othersAccountId)) {
                System.out.println("ERROR othersAccountId === loginAccount.getCardId()");
                continue;
            }
            if(accountItem == null) {
                System.out.println("ERROR not found about account");
            } else {
                while (true) {
                    System.out.println("输入转账金额");
                    double money = scanner.nextDouble();
                    if(money > loginAccount.getMoney()) {
                        System.out.println("金额不足，当前账户余额：" + loginAccount.getMoney());
                    }
                    if(loginAccount.getQuotaMoney() < money) {
                        System.out.println("当前转账金额大于该账户限额：" + loginAccount.getQuotaMoney());
                    } else {
                        loginAccount.setMoney(loginAccount.getMoney() - money);
                        accountItem.setMoney(accountItem.getMoney() + money);
                        System.out.println("转账成功，当前账户余额为：" + loginAccount.getMoney());
                        return;
                    }
                }
            }
        }

    }

    private static void drawMoney(AccountItem loginAccount, Scanner scanner) {
        System.out.println("用户取钱操作");
        if(loginAccount.getMoney() < 100) {
            System.out.println("余额不足100元，请进行存款后再试");
            return;
        }
        while (true) {
            System.out.println("请输入取款金额");
            double money = scanner.nextDouble();
            if(money > loginAccount.getQuotaMoney()) {
                System.out.println("sorry ~超过限额，目前限额为：" + loginAccount.getQuotaMoney());
            } else {
                if(money > loginAccount.getMoney()) {
                    System.out.println("余额不足，目前账户总余额为：" + loginAccount.getMoney());
                } else {
                    System.out.println("恭喜取款成功～当前余额" + loginAccount.getMoney());
                    loginAccount.setMoney(loginAccount.getMoney() - money);
                    showCurrentLoginAccount(loginAccount);
                    return;
                }
            }
        }
    }

    private static void depositMoney(AccountItem loginAccount, Scanner scanner) {
        System.out.println("=========用户存钱操作========");
        System.out.println("请输入要存储的金额");
        double money = scanner.nextDouble();
        loginAccount.setMoney(loginAccount.getMoney() + money);
        System.out.println("恭喜存钱操作成功");
        showCurrentLoginAccount(loginAccount);
    }

    private static void showCurrentLoginAccount(AccountItem loginAccount) {
        System.out.println("=================当前登录用户卡片信息=================");
        System.out.println("卡号：" + loginAccount.getCardId());
        System.out.println("用户名：" + loginAccount.getUserName());
        System.out.println("余额：" + loginAccount.getMoney());
        System.out.println("限额：" + loginAccount.getQuotaMoney());
    }

    private static void register(ArrayList<AccountItem> accounts, Scanner scanner) {
        AccountItem accountItem = new AccountItem();

        System.out.println("请输入账户名：");
        String userName = scanner.next();
        accountItem.setUserName(userName);
        while (true) {
            System.out.println("请输入账户密码：");
            String password = scanner.next();
            System.out.println("请输入再次账户密码：");
            String passwordAgain = scanner.next();
            if(password.equals(passwordAgain)) {
                accountItem.setPassword(password);
                break;
            } else {
                System.out.println("密码不一致，请重新输入");
            }
        }

        String cardId = getRandomCardId(accounts);
        accountItem.setCardId(cardId);

        System.out.println("请输入账户日累计额度：");
        double quotaMoney = scanner.nextDouble();
        accountItem.setQuotaMoney(quotaMoney);

        //
        accounts.add(accountItem);
        System.out.println("恭喜" + accountItem.getUserName() + "开户成功～您的卡号是：" + accountItem.getCardId());
    }

    private static String getRandomCardId(ArrayList<AccountItem> accounts) {
        while (true) {
            String id = "";
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                id += r.nextInt(10);
            }

            AccountItem accountItem = getAccountById(id,accounts);
            if(accountItem == null) {
                return id;
            }
        }
    }

    private static AccountItem getAccountById(String id,ArrayList<AccountItem> accounts) {
        for (AccountItem a : accounts) {
            if (a.getCardId().equals(id)) {
                return a;
            }
        }
        return null;
    }
}
