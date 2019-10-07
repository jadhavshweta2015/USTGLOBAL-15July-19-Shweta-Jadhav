import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobile',
  templateUrl: './mobile.component.html',
  styleUrls: ['./mobile.component.css']
})
export class MobileComponent implements OnInit {
  mobileData:any='';
  constructor() { }
  Mobiles=[
    {
      company:'Iphone',
      img:'https://cdn.pixabay.com/photo/2014/08/05/10/30/iphone-410324__340.jpg',
      descrition:'The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface. The iPhone runs the iOS operating system (OS), and as of 2017, there were 2.2 million apps available for it through the Apple App Store, according to Statista.'
    },
    {
      company:'Samsung',
      img:'https://cdn.pixabay.com/photo/2017/04/26/16/06/mobile-2262928__340.jpg',
      descrition:'Samsung, South Korean company that is one of the worlds largest producers of electronic devices. Samsung specializes in the production of a wide variety of consumer and industry electronics, including appliances, digital media devices, semiconductors, memory chips, and integrated systems.'
    },
    {
      company:'Redmi',
      img:'https://image.shutterstock.com/image-vector/realistic-vector-flat-mockup-smartphone-260nw-1393077065.jpg',
      descrition:'Redmi is a China-based smartphone and a sub-brand owned by the Chinese electronics company Xiaomi. It was introduced as a budget smartphone line manufactured by Xiaomi, that was first announced in July 2013.'
    },
    {
      company:'Honor',
      img:'https://cdn.pixabay.com/photo/2017/07/31/13/13/huawei-2557932__340.jpg',
      descrition:'Redmi is a China-based smartphone and a sub-brand owned by the Chinese electronics company Xiaomi. It was introduced as a budget smartphone line manufactured by Xiaomi, that was first announced in July 2013.The Honor 9 Lite is fitted with a 5.65-inch IPS LCD display that flaunts a resolution of 1,080 x 2,160 pixels, which results into a good 427 pixels per inch. Acting as a powerhouse of the smartphone, there is a pair of quad-core Cortex A53 processors, which clock at the speed of 2.36GHz and 1.7GHz.'
    },
    {
      company:'Honor',
      img:'https://cdn.pixabay.com/photo/2017/07/31/13/13/huawei-2557932__340.jpg',
      descrition:'Redmi is a China-based smartphone and a sub-brand owned by the Chinese electronics company Xiaomi. It was introduced as a budget smartphone line manufactured by Xiaomi, that was first announced in July 2013.The Honor 9 Lite is fitted with a 5.65-inch IPS LCD display that flaunts a resolution of 1,080 x 2,160 pixels, which results into a good 427 pixels per inch. Acting as a powerhouse of the smartphone, there is a pair of quad-core Cortex A53 processors, which clock at the speed of 2.36GHz and 1.7GHz.'
    }
  ];
  sendMobile(mbl){
    this.mobileData=mbl;
  }
  ngOnInit() {
  }

}
