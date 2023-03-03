package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
	// プログラムを作成
	
	private int minutes;

	public FlyingPhone(int minutes) {
		this.minutes = minutes;
	}
	
	@Override
	//Flyingクラス（インターフェース）のpowerOff()を呼び出す。
	public void powerOff() {
		Flying.super.powerOff();
	}
	
	@Override
	//Flyingクラス（インターフェース）のfly()を呼び出し、下記処理で上書きする。
	public void fly() {
		System.out.println(minutes + "分間、飛びます。");
	}
	
	@Override
	//Phoneクラス（インターフェース）のcall()を呼び出し、下記処理で上書きする。
	public void call(String number) {
		System.out.println(number + " に電話します。通話できるのは飛んでいる間だけです。");
	}

}
