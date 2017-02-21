# Firebase-Messaging-Example

# Firebase Console  >>  https://console.firebase.google.com/

https://github.com/tontheonelove/Firebase-Messaging-Notifical/blob/master/Firebase-Android-Configuration-e1470927322754-620x466.png

Add App button. This will download the google-services.json configuration file for your app. Copy this file into your project’s module folder, typically inside app/ directory.

# https://github.com/tontheonelove/Firebase-Messaging-Notifical/blob/master/Project-Structure.png


# Modify the project level build.gradle (<project>/build.gradle)

buildscript {

  dependencies {
  
    // Add this line
    
    classpath 'com.google.gms:google-services:3.0.0'
    
  }
  
}


# And, add the following to app module level build.gradle file.

apply plugin: 'com.android.application'

android {

   ....
   
}

dependencies {

    compile fileTree(dir: 'libs', include: ['*.jar'])
    
    ...
    
    //Add this
    
    compile 'com.google.firebase:firebase-messaging:9.4.0'
    
}

// Add to the bottom of the file

apply plugin: 'com.google.gms.google-services'


# SEND NOTIFICAL FROM FIREBASE CONSOLE

#https://github.com/tontheonelove/Firebase-Messaging-Notifical/blob/master/Send-Firebase-Notification-620x388.png




https://github.com/tontheonelove/Firebase-Messaging-Notifical/blob/master/Firebase-Cloud-Messaging-for-Android-Example-620x507.png
