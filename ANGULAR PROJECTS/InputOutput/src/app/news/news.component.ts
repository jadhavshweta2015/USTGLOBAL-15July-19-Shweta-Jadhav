import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-news',
  templateUrl: './news.component.html',
  styleUrls: ['./news.component.css']
})
export class NewsComponent implements OnInit {
  newsData:any='';
  constructor() { }
  News=[
    {
      news:'Sushma Swaraj passed away',
      img:'data:image/jpeg;base64,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',
      description:'Senior BJP leader and former foreign minister Sushma Swaraj passed away after a massive cardiac arrest late on Tuesday evening in Delhi. She was 67. The popular politician, who made the foreign ministry accessible through social media, had health complications arising from diabetes, but was not suffering from any immediate health emergency. She underwent a kidney transplant in 2016 and despite a few spells of hospitalisation, was understood to be getting better.'
    },
    {
      news:'Chandrayaan-2s ready to shoot free of Earth',
      img:'data:image/jpeg;base64,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',
      description:'Indias second mission to the Moon, successfully carried out its fifth and final orbit-raising manoeuvre around the Earth on Tuesday afternoon, the Indian Space Research Organisation (ISRO) informed. And now it will be injected into the Moons orbit ahead of Independence Day, on August 14, between 0300 and 0400 hrs (IST)'
    },
    {
      news:'Kolhapur flood',
      img:'https://cdn.pixabay.com/photo/2012/10/25/14/21/flood-62785__340.jpg',
      description:'Five rescue teams of the Indian Navy have been mobilised to provide assistance to those affected by heavy rains in Maharashtra’s Kolhapur and Sangli districts, an official said on Wednesday.Kolhapur and Sangli have been the worst affected by heavy rains in western Maharashtra in the last few days.Three villages, having around 7,000 people, in Kolhapur were marooned due to the floods, even as over 50,000 people were evacuated from the two districts on Tuesday.'
    },
    {
      news:'Rainy Weather',
      img:'https://cdn.pixabay.com/photo/2015/09/30/08/33/flood-965092__340.jpg',
      description:'Mumbai Rains Highlights: Schools and colleges will be shut Monday in Mumbai, suburbs, Thane, Palghar, and Raigad district, Chief Minister Devendra Fadnavis said.Several passengers were stranded at Mumbai’s Lokmanya Tilak Terminus Sunday night after 12 trains were cancelled, and many others were shortly-terminated, diverted, or rescheduled, following heavy rains in the city. At least 18 trains have been cancelled Monday morning.'
    }
  ];
  sendNews(newss){
    this.newsData=newss;
  }
  ngOnInit() {
  }

}