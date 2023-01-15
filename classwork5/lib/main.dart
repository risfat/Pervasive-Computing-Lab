import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        // This is the theme of your application.
        //
        // Try running your application with "flutter run". You'll see the
        // application has a blue toolbar. Then, without quitting the app, try
        // changing the primarySwatch below to Colors.green and then invoke
        // "hot reload" (press "r" in the console where you ran "flutter run",
        // or simply save your changes to "hot reload" in a Flutter IDE).
        // Notice that the counter didn't reset back to zero; the application
        // is not restarted.
        primarySwatch: Colors.blue,
      ),
      home: Container(
        width: 290,
        height: 52,
        child: Stack(
          children:[
            Positioned.fill(
              child: Align(
                alignment: Alignment.bottomLeft,
                child: Container(
                  width: 290,
                  height: 44,
                  decoration: BoxDecoration(
                    borderRadius: BorderRadius.circular(8),
                    border: Border.all(color: Color(0xff552fab), width: 1, ),
                  ),
                  padding: const EdgeInsets.only(left: 20, right: 19, top: 13, bottom: 12, ),
                  child: Row(
                    mainAxisSize: MainAxisSize.min,
                    mainAxisAlignment: MainAxisAlignment.start,
                    crossAxisAlignment: CrossAxisAlignment.center,
                    children:[
                      Container(
                        width: 14,
                        height: 19,
                        child: Stack(
                          children:[],
                        ),
                      ),
                      SizedBox(width: 99.50),
                      Text(
                        "DSC",
                        style: TextStyle(
                          color: Colors.black,
                          fontSize: 12,
                          letterSpacing: 0.51,
                        ),
                      ),
                      SizedBox(width: 99.50),
                      Container(
                        width: 10.98,
                        height: 5.94,
                        decoration: BoxDecoration(
                          borderRadius: BorderRadius.circular(8),
                          color: Color(0xff552fab),
                        ),
                      ),
                    ],
                  ),
                ),
              ),
            ),
            Positioned(
              left: 30,
              top: 0,
              child: Text(
                "Destination",
                style: TextStyle(
                  color: Color(0xff552fab),
                  fontSize: 12,
                  letterSpacing: 0.51,
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }
}

