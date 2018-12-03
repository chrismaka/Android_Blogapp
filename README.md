# Android_Blogapp
An android blog app that doesn't require user to signup to use, but requires user to signup in order to post
Thanks to this article https://medium.com/@peterekeneeze/build-a-simple-blog-app-with-firebase-in-android-studio-b6482275408 , i found a foundation for building this app.

I modified the original to create this new version as follows:

1.I changed the Realtime Database rules so that it would allow unregistered users to view posted content on the app
2.Maintained the database rules so that only registered users could post.
3. I changed the layout of the app to use a Tabbed Layout and a ViewPager so that the home screen allows swipping.
4.I changed the activity that displays retrieved content into a fragment so that i could reuse it in more than one place on the screen.

Beyond that, i left the original code mostly as it is.

A few issues will be encountered that are as a result of conflicting dependencies including Dex erros, finding the right dependency for the
 FirebaseRecyclerAdapter and many others. I shall attempt to recreate these exact errors and post how i fixed them.
 
 NOTE: i cannot overstate the importance of reading the logout for someone starting out. Its a very useful
