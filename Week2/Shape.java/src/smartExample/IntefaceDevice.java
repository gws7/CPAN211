/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package smartExample;

interface SmartDevice {  // The common standard
    void turnOn();       // Action 1: Turn the device on
    void turnOff();      // Action 2: Turn the device off
}

class SmartLight implements SmartDevice {
    public void turnOn() {
        System.out.println("SmartLight glows brightly!");
    }
    public void turnOff() {
        System.out.println("SmartLight is now dark.");
    }
}

class SmartFan implements SmartDevice {
    public void turnOn() {
        System.out.println("SmartFan is spinning.");
    }
    public void turnOff() {
        System.out.println("SmartFan has stopped.");
    }
}
public class IntefaceDevice {
    static void display(SmartDevice device){
        if(device instanceof SmartLight){
            System.out.println("SmartLight instance");
        } else if (device instanceof SmartFan) {
            System.out.println("SmartFan instance");
        } else {
            System.out.println("Invalid object");
        }
    }

    public static void main(String[] args) {
        SmartDevice device1 = new SmartLight();
        SmartDevice device2 = new SmartFan();

        device1.turnOn();
        device2.turnOn();
        device1.turnOff();
        device2.turnOff();
        display(device1);
        display(device2);

    }
}
/*
"Why do we need an interface when each device could have its own methods?"

The interface ensures consistency and allows polymorphism.

"What would happen if another device, say a Smart AC, needs to be added?"

You extend the system by implementing the interface in the new class.
*/

