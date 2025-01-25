/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.schoolmanagementsystem;

import javax.swing.SwingUtilities;
import newPackage1.LoginForm;


public class SchoolManagementSystem {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run(){
            new LoginForm().setVisible(true);
        }
    });
    }
}
