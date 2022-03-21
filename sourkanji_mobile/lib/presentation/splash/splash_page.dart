import 'package:flutter/material.dart';
import 'package:flutter_modular/flutter_modular.dart';
import 'package:sourkanji_mobile/presentation/splash/splash_controller.dart';

class SplashPage extends StatefulWidget {
  const SplashPage({Key? key}) : super(key: key);

  @override
  State<SplashPage> createState() => _SplashPageState();
}

class _SplashPageState extends ModularState<SplashPage, SplashControler> {
  @override
  void initState() {
    controller.onInit();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return const Scaffold(
      body: Center(
        child: Text("Sour Kanji"),
      ),
    );
  }
}
