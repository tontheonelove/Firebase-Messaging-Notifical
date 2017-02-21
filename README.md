# Firebase-Messaging-Example

# Firebase Console  >>  https://console.firebase.google.com/

Add App button. This will download the google-services.json configuration file for your app. Copy this file into your project’s module folder, typically inside app/ directory.

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


