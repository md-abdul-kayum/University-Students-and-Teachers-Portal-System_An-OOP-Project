
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class profile_teacher extends javax.swing.JFrame {

    /**
     * Creates new form profile_teacher
     */
    public profile_teacher() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        home = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        grade = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        course = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        attendence = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        schedule = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        profile = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        home_logout = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Teacher Portal Profile");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(245, 249, 221));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(32767, 32767));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled2.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled4.png"))); // NOI18N

        home.setBackground(new java.awt.Color(245, 249, 221));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("       Home");

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        grade.setBackground(new java.awt.Color(245, 249, 221));
        grade.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                gradeMouseDragged(evt);
            }
        });
        grade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gradeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gradeMouseEntered(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jLabel6.setText("Grade Sheet Entry");

        javax.swing.GroupLayout gradeLayout = new javax.swing.GroupLayout(grade);
        grade.setLayout(gradeLayout);
        gradeLayout.setHorizontalGroup(
            gradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gradeLayout.setVerticalGroup(
            gradeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gradeLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        course.setBackground(new java.awt.Color(245, 249, 221));
        course.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                courseMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(245, 249, 221));
        jLabel7.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jLabel7.setText("Course Registration");

        javax.swing.GroupLayout courseLayout = new javax.swing.GroupLayout(course);
        course.setLayout(courseLayout);
        courseLayout.setHorizontalGroup(
            courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        courseLayout.setVerticalGroup(
            courseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, courseLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        attendence.setBackground(new java.awt.Color(245, 249, 221));
        attendence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendenceMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jLabel8.setText("Students Attendence");

        javax.swing.GroupLayout attendenceLayout = new javax.swing.GroupLayout(attendence);
        attendence.setLayout(attendenceLayout);
        attendenceLayout.setHorizontalGroup(
            attendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        attendenceLayout.setVerticalGroup(
            attendenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, attendenceLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        schedule.setBackground(new java.awt.Color(245, 249, 221));
        schedule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scheduleMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Class Schedule");

        javax.swing.GroupLayout scheduleLayout = new javax.swing.GroupLayout(schedule);
        schedule.setLayout(scheduleLayout);
        scheduleLayout.setHorizontalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        scheduleLayout.setVerticalGroup(
            scheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scheduleLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        profile.setBackground(new java.awt.Color(102, 153, 255));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("    Profile");

        javax.swing.GroupLayout profileLayout = new javax.swing.GroupLayout(profile);
        profile.setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profileLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        jLabel12.setText("You are logged in as:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Md.Ansarul Islam");

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel16.setText("TeacherID:");

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel17.setText("01303354189");

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel18.setText("Teacher Name:");

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel19.setText("Md.Ansalul Islam");

        home_logout.setBackground(new java.awt.Color(245, 249, 221));
        home_logout.setPreferredSize(new java.awt.Dimension(100, 11));
        home_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                home_logoutMouseClicked(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        logout.setForeground(new java.awt.Color(153, 51, 255));
        logout.setText("(Log out)");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout home_logoutLayout = new javax.swing.GroupLayout(home_logout);
        home_logout.setLayout(home_logoutLayout);
        home_logoutLayout.setHorizontalGroup(
            home_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_logoutLayout.createSequentialGroup()
                .addComponent(logout)
                .addGap(0, 56, Short.MAX_VALUE))
        );
        home_logoutLayout.setVerticalGroup(
            home_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_logoutLayout.createSequentialGroup()
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jLabel29.setFont(new java.awt.Font("Arial Black", 2, 10)); // NOI18N
        jLabel29.setText("UI Designed by: Kaiyum & Hasib");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 102, 255));
        jLabel11.setText("My Profile");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ansar sir-image.jpg"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setText("Md. Ansarul Islam");

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(102, 102, 102));
        jLabel20.setText("Lecturer");

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jLabel21.setText("Computer Science & Engineering");

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel22.setText("Green University Of Bangladesh");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("ansarul@cse.green.edu.bd");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("Education:");

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel25.setText("Bachelor of Science in CSE (RUET) 2015-2019");

        jLabel26.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel26.setText("Higher Secondary Certificate (Thakurgaon Govt. College) 2014");

        jLabel27.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel27.setText("Secondary School Certificate (Puratan Thakurgaon High School) 2012");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel30.setText("Experience:");

        jLabel31.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel31.setText("Lecturer, Department of CSE");

        jLabel32.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        jLabel32.setText("Green University (17-09-2019-Present)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(attendence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(schedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel13)
                        .addGap(5, 5, 5)
                        .addComponent(home_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(237, 237, 237)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(509, 509, 509)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(997, 997, 997)
                        .addComponent(jLabel29))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(491, 491, 491)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(418, 418, 418)
                        .addComponent(jLabel27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(251, 251, 251)
                                .addComponent(jLabel20))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(206, 206, 206)
                                .addComponent(jLabel23))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel22))
                                    .addComponent(jLabel21)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(235, 235, 235)
                                .addComponent(jLabel24))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(jLabel25))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel26)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(497, 497, 497))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(522, 522, 522))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(480, 480, 480))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(446, 446, 446))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(attendence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(schedule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel19))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(home_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel15)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addGap(27, 27, 27)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(124, 124, 124)
                .addComponent(jLabel29)
                .addGap(7, 7, 7)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked

        // TODO add your handling code here:
        close();
        teacher_home hom=new teacher_home();
        hom.setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void gradeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradeMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeMouseDragged

    private void gradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradeMouseClicked

         close();
        grade gr= new grade();
        gr.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_gradeMouseClicked

    private void gradeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gradeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeMouseEntered

    private void courseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_courseMouseClicked

        close();
        course cr= new course();
        cr.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_courseMouseClicked

    private void attendenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendenceMouseClicked

      close();
        attendance att= new attendance();
        att.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_attendenceMouseClicked

    private void scheduleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scheduleMouseClicked

       close();
        class_scdule cs= new class_scdule();
        cs.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_scheduleMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked

         close();
        profile_teacher pro= new profile_teacher();
        pro.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_profileMouseClicked

    private void home_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_home_logoutMouseClicked

        
    }//GEN-LAST:event_home_logoutMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
         close();
        teacher_login sp= new teacher_login();
        sp.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(profile_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile_teacher().setVisible(true);
            }
        });
    }
    
    public void close()
    {
        
        WindowEvent closeWindow= new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel attendence;
    private javax.swing.JPanel course;
    private javax.swing.JPanel grade;
    private javax.swing.JPanel home;
    private javax.swing.JPanel home_logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel profile;
    private javax.swing.JPanel schedule;
    // End of variables declaration//GEN-END:variables
}
