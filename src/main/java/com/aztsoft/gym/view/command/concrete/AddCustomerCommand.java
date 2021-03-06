/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aztsoft.gym.view.command.concrete;

import com.aztsoft.gym.controller.CustomerController;
import com.aztsoft.gym.view.command.abstractcommand.Command;

/**
 *
 * @author arnold9108@gmail.com
 */
public class AddCustomerCommand implements Command {
    private final CustomerController controller;
    
    public AddCustomerCommand(CustomerController controller) {
        this.controller = controller;
    }
    
    @Override
    public void execute() {
        controller.postCustomer();
    }
    
}
