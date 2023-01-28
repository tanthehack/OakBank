import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class OakBank_ATM extends JFrame {
    private JPanel panel1;
    private JPanel pnlLogin;
    private JButton btnLogin;
    private JLabel oakLogo;
    private JPasswordField txtPin;
    private JLabel lblWelcome2;
    private JLabel lblWelcome;
    private JPanel pnlPin;
    private JPanel pnlHome;
    private JLabel lblError;
    private JButton btnWithdraw;
    private JButton btnLogout;
    private JButton btnDeposit;
    private JButton btnTransfer;
    private JButton btnBalance;
    private JLabel lblChoose;
    private JPanel pnlBalance;
    private JButton btnBalBack;
    private JPanel pnlCurrent;
    private JLabel lblCurrent;
    private JLabel lblSaving;
    private JLabel lblCurrentTitle;
    private JLabel lblSavingsTitle;
    private JPanel pnlWithdraw;
    private JLabel lblAccount;
    private JComboBox comboAccounts;
    private JTextField txtAmountWithdraw;
    private JButton btnWithdrawAcc;
    private JButton btnWithBack;
    private JPanel pnlWithAmnt;
    private JLabel lblErrorWith;
    private JPanel pnlSuccess;
    private JButton btnSuccessBack;
    private JLabel lblSuccess;
    private JLabel lblFail;
    private JLabel lblValidationMessage;
    private JLabel lblValMessage2;
    private JPanel pnlDeposit;
    private JLabel lblAccountBal;
    private JButton btnDepositBack;
    private JButton btnDepositAcc;
    private JComboBox comboAccountDeposit;
    private JTextField txtAmountDeposit;
    private JPanel pnlAmntDeposit;
    private JPanel pnlTransfer;
    private JTextField txtAcountNumber;
    private JButton btnTransferBack;
    private JComboBox comboAccountTransfer;
    private JLabel lblAccBal;
    private JComboBox comboChooseBank;
    private JPanel pnlAmntTransfer;
    private JTextField txtAmountTransfer;
    private JButton btnTransferAcc;
    private JLabel lblErrorTransfer;
    private JLabel lblErorrDeposit;
    private JLabel lblValMessage3;

    public OakBank_ATM(String title) {
            super(title);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setContentPane(panel1);
            this.pack();

        pnlHome.setBackground(Color.decode("#FFFFFF"));
        panel1.setBackground(Color.decode("#FFFFFF"));

        pnlPin.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.decode("#219EBC")));

        txtPin.setBorder(BorderFactory.createLineBorder(Color.decode("#FFFFFF")));
        txtPin.setBackground(Color.decode("#FFFFFF"));
        txtPin.setForeground(Color.decode("#2E2E2E"));
        txtPin.setCaretColor(Color.decode("#2E2E2E"));

        btnLogin.setBorderPainted(false);
        btnLogin.setFocusPainted(false);
        btnLogin.setContentAreaFilled(false);

        btnLogout.setBorderPainted(false);
        btnLogout.setFocusPainted(false);
        btnLogout.setContentAreaFilled(false);

        btnWithdraw.setBorderPainted(false);
        btnWithdraw.setFocusPainted(false);
        btnWithdraw.setContentAreaFilled(false);

        btnDeposit.setBorderPainted(false);
        btnDeposit.setFocusPainted(false);
        btnDeposit.setContentAreaFilled(false);

        btnBalance.setBorderPainted(false);
        btnBalance.setFocusPainted(false);
        btnBalance.setContentAreaFilled(false);

        btnTransfer.setBorderPainted(false);
        btnTransfer.setFocusPainted(false);
        btnTransfer.setContentAreaFilled(false);

        btnBalBack.setBorderPainted(false);
        btnBalBack.setFocusPainted(false);
        btnBalBack.setContentAreaFilled(false);

        comboAccounts.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.decode("#219EBC")));
        comboAccounts.setBackground(Color.decode("#FFFFFF"));

        comboAccountDeposit.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.decode("#219EBC")));
        comboAccountDeposit.setBackground(Color.decode("#FFFFFF"));

        comboAccountTransfer.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.decode("#219EBC")));
        comboAccountTransfer.setBackground(Color.decode("#FFFFFF"));

        comboChooseBank.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.decode("#219EBC")));
        comboChooseBank.setBackground(Color.decode("#FFFFFF"));

        btnWithBack.setBorderPainted(false);
        btnWithBack.setFocusPainted(false);
        btnWithBack.setContentAreaFilled(false);

        btnWithdrawAcc.setBorderPainted(false);
        btnWithdrawAcc.setFocusPainted(false);
        btnWithdrawAcc.setContentAreaFilled(false);

        pnlWithAmnt.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.decode("#219EBC")));
        txtAmountWithdraw.setBorder(BorderFactory.createLineBorder(Color.decode("#FFFFFF")));
        txtAmountWithdraw.setBackground(Color.decode("#FFFFFF"));
        txtAmountWithdraw.setForeground(Color.decode("#2E2E2E"));
        txtAmountWithdraw.setCaretColor(Color.decode("#2E2E2E"));

        btnDepositBack.setBorderPainted(false);
        btnDepositBack.setFocusPainted(false);
        btnDepositBack.setContentAreaFilled(false);

        btnDepositAcc.setBorderPainted(false);
        btnDepositAcc.setFocusPainted(false);
        btnDepositAcc.setContentAreaFilled(false);

        pnlAmntDeposit.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.decode("#219EBC")));
        txtAmountDeposit.setBorder(BorderFactory.createLineBorder(Color.decode("#FFFFFF")));
        txtAmountDeposit.setBackground(Color.decode("#FFFFFF"));
        txtAmountDeposit.setForeground(Color.decode("#2E2E2E"));
        txtAmountDeposit.setCaretColor(Color.decode("#2E2E2E"));

        btnTransferBack.setBorderPainted(false);
        btnTransferBack.setFocusPainted(false);
        btnTransferBack.setContentAreaFilled(false);

        btnTransferAcc.setBorderPainted(false);
        btnTransferAcc.setFocusPainted(false);
        btnTransferAcc.setContentAreaFilled(false);

        pnlAmntTransfer.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.decode("#219EBC")));
        txtAmountTransfer.setBorder(BorderFactory.createLineBorder(Color.decode("#FFFFFF")));
        txtAmountTransfer.setBackground(Color.decode("#FFFFFF"));
        txtAmountTransfer.setForeground(Color.decode("#2E2E2E"));
        txtAmountTransfer.setCaretColor(Color.decode("#2E2E2E"));

        btnSuccessBack.setBorderPainted(false);
        btnSuccessBack.setFocusPainted(false);
        btnSuccessBack.setContentAreaFilled(false);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] input = txtPin.getPassword();

                Login data = new Login();
                boolean pass_validation = data.isPinCorrect(input);

                if(pass_validation){
                    lblError.setText("Correct!");
                    lblError.setForeground(Color.green);

                    Timer timer = new Timer(500, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            lblError.setText("");
                            txtPin.setText("");
                            pnlLogin.setVisible(false);
                            pnlHome.setVisible(true);
                        }
                    } );

                    timer.setRepeats(false);
                    timer.start();

                ;} else if (!pass_validation && input.length > 4) {
                    lblError.setText("4 Digits Only!");
                } else {
                    lblError.setText("Wrong Pin! Please try again.");
                }
            }
        });

        btnLogin.setRolloverEnabled(false);
        btnLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnLogin.setVerticalAlignment(JButton.TOP);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnLogin.setVerticalAlignment(JButton.CENTER);
            }
        });

        btnWithdraw.setRolloverEnabled(false);
        btnWithdraw.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnWithdraw.setVerticalAlignment(JButton.TOP);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnWithdraw.setVerticalAlignment(JButton.CENTER);
            }
        });

        btnDeposit.setRolloverEnabled(false);
        btnDeposit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnDeposit.setVerticalAlignment(JButton.TOP);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnDeposit.setVerticalAlignment(JButton.CENTER);
            }
        });

        btnTransfer.setRolloverEnabled(false);
        btnTransfer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnTransfer.setVerticalAlignment(JButton.TOP);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnTransfer.setVerticalAlignment(JButton.CENTER);
            }
        });

        btnBalance.setRolloverEnabled(false);
        btnBalance.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnBalance.setVerticalAlignment(JButton.TOP);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnBalance.setVerticalAlignment(JButton.CENTER);
            }
        });

        btnLogout.setRolloverEnabled(false);
        btnLogout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnLogout.setVerticalAlignment(JButton.TOP);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnLogout.setVerticalAlignment(JButton.CENTER);
            }
        });

        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlHome.setVisible(false);
                pnlLogin.setVisible(true);
            }
        });

        btnBalBack.setRolloverEnabled(false);
        btnBalBack.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnBalBack.setVerticalAlignment(JButton.TOP);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnBalBack.setVerticalAlignment(JButton.CENTER);
            }
        });

        btnSuccessBack.setRolloverEnabled(false);
        btnSuccessBack.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnSuccessBack.setVerticalAlignment(JButton.TOP);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSuccessBack.setVerticalAlignment(JButton.CENTER);
            }
        });

        btnDepositBack.setRolloverEnabled(false);
        btnDepositBack.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnDepositBack.setVerticalAlignment(JButton.TOP);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnDepositBack.setVerticalAlignment(JButton.CENTER);
            }
        });

        btnDepositAcc.setRolloverEnabled(false);
        btnDepositAcc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnDepositAcc.setVerticalAlignment(JButton.TOP);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnDepositAcc.setVerticalAlignment(JButton.CENTER);
            }
        });

        btnBalBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlBalance.setVisible(false);
                pnlHome.setVisible(true);
            }
        });

        btnTransferAcc.setRolloverEnabled(false);
        btnTransferAcc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnTransferAcc.setVerticalAlignment(JButton.TOP);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnTransferAcc.setVerticalAlignment(JButton.CENTER);
            }
        });

        btnTransferBack.setRolloverEnabled(false);
        btnTransferBack.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnTransferBack.setVerticalAlignment(JButton.TOP);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnTransferBack.setVerticalAlignment(JButton.CENTER);
            }
        });

        btnBalance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlHome.setVisible(false);
                pnlBalance.setVisible(true);

                lblCurrent.setText("₦" + ReadData("current"));
                lblSaving.setText("₦" + ReadData("saving"));
            }
        });

        txtAmountWithdraw.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(((e.getKeyChar() >= '0') && (e.getKeyChar() <= '9')) || e.getKeyChar() == '\b') {
                    txtAmountWithdraw.setEditable(true);
                    lblErrorWith.setText("");
                } else {
                    txtAmountWithdraw.setEditable(false);
                    lblErrorWith.setText("*Enter Numbers Only!");
                }
            }
        });

        btnWithBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlWithdraw.setVisible(false);
                pnlHome.setVisible(true);

                txtAmountWithdraw.setText("");
            }
        });

        btnWithdraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(comboAccounts.getSelectedIndex() == 0){
                    lblAccount.setText("₦" + ReadData("current"));
                }

                if(comboAccounts.getSelectedIndex() == 1){
                    lblAccount.setText("₦" + ReadData("saving"));
                }

                lblSuccess.setVisible(false);
                lblFail.setVisible(false);
                txtAmountWithdraw.setText("");
                lblValMessage3.setText("");

                pnlHome.setVisible(false);
                pnlWithdraw.setVisible(true);
            }
        });

        btnSuccessBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlSuccess.setVisible(false);
                pnlHome.setVisible(true);
            }
        });

        btnWithdrawAcc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Float amount = Float.valueOf(txtAmountWithdraw.getText());
                Float bal = null;

                if(comboAccounts.getSelectedIndex() == 0) {
                    bal = Float.valueOf(ReadData("current"));
                }

                if (comboAccounts.getSelectedIndex() == 1) {
                    bal = Float.valueOf(ReadData("savings"));
                }

                if(bal > amount){
                    Float newBal = bal - amount;
                    writeData(String.valueOf(bal), String.valueOf(newBal));

                    lblValidationMessage.setText("Success!");
                    lblValMessage2.setText("Wait to collect your cash from the dispenser");

                    lblSuccess.setVisible(true);
                    pnlWithdraw.setVisible(false);
                    pnlSuccess.setVisible(true);
                } else {
                    lblFail.setVisible(true);
                    lblValMessage3.setVisible(true);

                    lblValidationMessage.setText("Failed");
                    lblValMessage2.setText("Could not withdraw " + "₦" + amount);
                    lblValMessage3.setText("Due to Insufficient Funds");

                    pnlWithdraw.setVisible(false);
                    pnlSuccess.setVisible(true);
                }
            }
        });

        comboAccounts.addKeyListener(new KeyAdapter() {
        });
        comboAccounts.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(comboAccounts.getSelectedIndex() == 0){
                    lblAccount.setText("₦" + ReadData("current"));
                } else {
                    lblAccount.setText("₦" + ReadData("saving"));
                }
            }
        });

        comboAccountDeposit.addKeyListener(new KeyAdapter() {
        });
        comboAccountDeposit.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(comboAccountDeposit.getSelectedIndex() == 0){
                    lblAccountBal.setText("₦" + ReadData("current"));
                } else {
                    lblAccountBal.setText("₦" + ReadData("saving"));
                }
            }
        });

        comboAccountTransfer.addKeyListener(new KeyAdapter() {
        });
        comboAccountTransfer.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(comboAccountTransfer.getSelectedIndex() == 0){
                    lblAccBal.setText("₦" + ReadData("current"));
                } else {
                    lblAccBal.setText("₦" + ReadData("saving"));
                }
            }
        });

        btnDeposit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlDeposit.setVisible(true);
                pnlHome.setVisible(false);

                if(comboAccountDeposit.getSelectedIndex() == 0){
                    lblAccountBal.setText("₦" + ReadData("current"));
                }

                if(comboAccountDeposit.getSelectedIndex() == 1){
                    lblAccountBal.setText("₦" + ReadData("saving"));
                }

                lblSuccess.setVisible(false);
                lblFail.setVisible(false);

                txtAmountDeposit.setText("");
                lblValMessage3.setText("");
            }
        });

        btnDepositBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlDeposit.setVisible(false);
                pnlHome.setVisible(true);
            }
        });

        btnDepositAcc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Float amount = Float.valueOf(txtAmountDeposit.getText());
                Float bal = null;

                if(comboAccountDeposit.getSelectedIndex() == 0) {
                    bal = Float.valueOf(ReadData("current"));
                }

                if (comboAccountDeposit.getSelectedIndex() == 1) {
                    bal = Float.valueOf(ReadData("savings"));
                }

                    Float newBal = bal + amount;

                    writeData(String.valueOf(bal), String.valueOf(newBal));

                    lblValidationMessage.setText("Success!");
                    lblValMessage2.setText("₦" + amount + " has been Deposited.");

                    lblSuccess.setVisible(true);
                    pnlDeposit.setVisible(false);
                    pnlSuccess.setVisible(true);
            }
        });

        txtAcountNumber.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(((e.getKeyChar() >= '0') && (e.getKeyChar() <= '9')) || e.getKeyChar() == '\b') {
                    txtAcountNumber.setEditable(true);
                    lblErrorTransfer.setText("");
                } else {
                    txtAcountNumber.setEditable(false);
                    lblErrorTransfer.setText("*Enter Numbers Only!");
                }
            }
        });

        txtAmountTransfer.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(((e.getKeyChar() >= '0') && (e.getKeyChar() <= '9')) || e.getKeyChar() == '\b') {
                    txtAmountTransfer.setEditable(true);
                    lblErrorTransfer.setText("");
                } else {
                    txtAmountTransfer.setEditable(false);
                    lblErrorTransfer.setText("*Enter Numbers Only!");
                }
            }
        });

        txtAmountDeposit.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(((e.getKeyChar() >= '0') && (e.getKeyChar() <= '9')) || e.getKeyChar() == '\b') {
                    txtAmountDeposit.setEditable(true);
                    lblErorrDeposit.setText("");
                } else {
                    txtAmountDeposit.setEditable(false);
                    lblErorrDeposit.setText("*Enter Numbers Only!");
                }
            }
        });

        btnTransfer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlTransfer.setVisible(true);
                pnlHome.setVisible(false);

                if(comboAccountTransfer.getSelectedIndex() == 0){
                    lblAccBal.setText("₦" + ReadData("current"));
                }

                if(comboAccountTransfer.getSelectedIndex() == 1){
                    lblAccBal.setText("₦" + ReadData("saving"));
                }

                lblSuccess.setVisible(false);
                lblFail.setVisible(false);
                txtAmountTransfer.setText("");
                lblValMessage3.setText("");
            }
        });

        btnTransferBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pnlTransfer.setVisible(false);
                pnlHome.setVisible(true);
            }
        });

        btnTransferAcc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Float amount = Float.valueOf(txtAmountTransfer.getText());
                Float bal = null;

                if(comboAccountTransfer.getSelectedIndex() == 0) {
                    bal = Float.valueOf(ReadData("current"));
                }

                if (comboAccountTransfer.getSelectedIndex() == 1) {
                    bal = Float.valueOf(ReadData("savings"));
                }

                if(bal > amount){
                    Float newBal = bal - amount;
                    writeData(String.valueOf(bal), String.valueOf(newBal));

                    lblValidationMessage.setText("Success!");
                    lblValMessage2.setText("₦" + amount + " has been sent.");
                    lblValMessage3.setText("to " + txtAcountNumber.getText());

                    lblSuccess.setVisible(true);
                    pnlWithdraw.setVisible(false);
                    pnlSuccess.setVisible(true);

                } else {
                    lblFail.setVisible(true);
                    lblValidationMessage.setText("Failed");
                    lblValMessage2.setText("₦" + amount +  " " + "Could not be sent.");
                    lblValMessage3.setText("Due to Insufficient Funds");

                    pnlTransfer.setVisible(false);
                    pnlSuccess.setVisible(true);
                }
            }
        });
    }

    public String ReadData(String lbl) {
        ReadData data = new ReadData();
        try {
            data.read();
            String currentBal = data.currentBal;
            String savingsBal = data.savingsBal;
            if(lbl == "current") {
                return currentBal;
            }

            return savingsBal;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void writeData(String oldBal, String newBal){
        File file = new File("src/data.txt");
        StringBuffer buffer = new StringBuffer();


        try {
            Scanner input = new Scanner(file);

            while(input.hasNext()) {
                buffer.append(input.nextLine() + System.lineSeparator());
            }

            String fileData = buffer.toString();
            input.close();

            fileData = fileData.replaceAll(oldBal, newBal);

            FileWriter writer = new FileWriter("src/data.txt");
            writer.append(fileData);
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args){
        //Creates the JFrame
        JFrame frame = new OakBank_ATM("Oak Bank ATM");
        frame.setVisible(true);
        frame.setMinimumSize(new Dimension(450, 600));
        frame.setResizable(false);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        //Custom UI for Bank Logo
        ImageIcon image = new ImageIcon("Resources/logo.png");
        Image nImage = image.getImage(); // transform it
        Image scaledImg = nImage.getScaledInstance(225, 161,  java.awt.Image.SCALE_SMOOTH);
        oakLogo = new JLabel(new ImageIcon(scaledImg));

        //Custom UI for Login Button Icon
        ImageIcon img = new ImageIcon("Resources/loginIcon.png");
        Image nImg = img.getImage(); // transform it
        Image sImg = nImg.getScaledInstance(34, 34,  java.awt.Image.SCALE_SMOOTH);
        btnLogin = new JButton(new ImageIcon(sImg));

        //Custom UI for Home Buttons
        btnWithdraw = new JButton(new ImageIcon("Resources/withdraw.png"));
        btnDeposit = new JButton(new ImageIcon("Resources/deposit.png"));
        btnTransfer = new JButton(new ImageIcon("Resources/transfer.png"));
        btnBalance = new JButton(new ImageIcon("Resources/balance.png"));
        btnLogout = new JButton(new ImageIcon("Resources/logout.png"));

        //Custom UI for Back Buttons
        btnBalBack = new JButton(new ImageIcon("Resources/back.png"));
        btnWithBack = new JButton(new ImageIcon("Resources/back.png"));
        btnSuccessBack = new JButton(new ImageIcon("Resources/back.png"));
        btnDepositBack = new JButton(new ImageIcon("Resources/back.png"));
        btnTransferBack = new JButton(new ImageIcon("Resources/back.png"));

        //Custom UI for Labels
        lblCurrent = new JLabel(new ImageIcon("Resources/current.png"));
        lblSaving = new JLabel(new ImageIcon("Resources/savings.png"));
        lblSuccess = new JLabel(new ImageIcon("Resources/success.png"));
        lblFail = new JLabel(new ImageIcon("Resources/fail.png"));

        //Custom UI for Labels and Buttons in Withdraw Page
        lblAccount = new JLabel(new ImageIcon("Resources/savings.png"));
        btnWithdrawAcc = new JButton(new ImageIcon("Resources/loginIcon.png"));

        //Custom UI for Labels and Buttons in Deposit Page
        lblAccountBal = new JLabel(new ImageIcon("Resources/savings.png"));
        btnDepositAcc = new JButton(new ImageIcon("Resources/loginIcon.png"));

        //Custom UI for Labels and Buttons in Transfer Page
        lblAccBal = new JLabel(new ImageIcon("Resources/savings.png"));
        btnTransferAcc = new JButton(new ImageIcon("Resources/loginIcon.png"));
    }
}
