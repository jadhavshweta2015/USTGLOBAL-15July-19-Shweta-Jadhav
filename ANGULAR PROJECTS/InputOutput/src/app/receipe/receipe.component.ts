import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-receipe',
  templateUrl: './receipe.component.html',
  styleUrls: ['./receipe.component.css']
})
export class ReceipeComponent implements OnInit {
  receipeData:any='';
  constructor() { }
  Receipe=[
    {
      receipe:'Maggy',
      img:'https://image.shutterstock.com/image-photo/maggie-spicy-noodles-instant-260nw-696121966.jpg',
      description:'To prepare this mouth-watering snack recipe, put a deep-bottomed pan over medium flame and add water in it and bring it to a boil. Meanwhile, take a chopping board and finely chop onion, capsicum, tomato and green chilli on it. Once the water begins to boil, add maggi masala noodles and peas to it and cook till the noodles and peas are soft and tender.Next, in another pan, add butter and let it melt. Then, add chopped onion and saute till it changes color. Now, add garlic paste, chopped capsicum, tomato and green chilli to it and saute well for a couple of minutes, till the tomatoes are soft.Next, in the sauted vegetables, add red chilli powder, turmeric powder, garam masala powder, black pepper powder in it and saute for a minute. Now, add the boiled maggi noodles and peas to this masala and mix well and cook for 1 more minute. Once done, transfer to a serving bowl and sprinkle a pinch of chaat masala over the noodles to make it even more flavorful. Serve it hot to enjoy!'
    },
    {
      receipe:'Ice-creame',
      img:'https://cdn.pixabay.com/photo/2016/03/23/15/00/ice-cream-cone-1274894__340.jpg',
      description:'Place sweetened condensed milk in the fridge to keep cold.using a hand or stand mixer fitted with a whisk attachment, whip the cold cream on medium/high speed until soft peaks form.Turn off the machine and pour the cold condensed milk into the whipped cream.Turn the speed up to high and whisk until the mixture is thick and stiff peaks form. Turn off the machine and stir in vanilla extract (optional).Making Homemade Ice Cream Flavors Now you have your ice cream base you can add in your desired flavors and fixing. GO NUTS! Try my 50+ ice cream flavors at my Gemmas Freezer Section or experiment with your own flavors and enjoy creating something that is all you. Generally, use two cups ice cream base and add mix ins to create your flavors.Once you finish creating your flavors, transfer your ice cream mixture to an airtight container and freeze for a minimum of 6 hours or overnight before eating.Keep stored in the freezer for up to 6 weeks.'
    },
    {
      receipe:'Salad',
      img:'https://image.shutterstock.com/image-photo/bowl-salad-vegetables-greens-on-260nw-499880467.jpg',
      description:'With a mandoline or vegetable peeler, cut the fennel, cucumber and apple into very thin slices. Transfer to a large bowl; toss with olive oil, salt and pepper. Top with radishes and reserved fennel fronds to serve.Try adding a squeeze of lemon. The little bit of acid would complement the dressing.Its easy to modify this recipe based on your taste and what you have on hand: Add more or less fennel, apple and cucumber.'
    },
    {
      receipe:'Noodles',
      img:'https://image.shutterstock.com/image-photo/chopsticks-take-chinese-noodles-sweet-260nw-1111644116.jpg',
      description:'To prepare this mouth-watering snack recipe, put a deep-bottomed pan over medium flame and add water in it and bring it to a boil. Meanwhile, take a chopping board and finely chop onion, capsicum, tomato and green chilli on it. Once the water begins to boil, add maggi masala noodles and peas to it and cook till the noodles and peas are soft and tender.Next, in another pan, add butter and let it melt. Then, add chopped onion and saute till it changes color. Now, add garlic paste, chopped capsicum, tomato and green chilli to it and saute well for a couple of minutes, till the tomatoes are soft.Next, in the sauted vegetables, add red chilli powder, turmeric powder, garam masala powder, black pepper powder in it and saute for a minute. Now, add the boiled maggi noodles and peas to this masala and mix well and cook for 1 more minute. Once done, transfer to a serving bowl and sprinkle a pinch of chaat masala over the noodles to make it even more flavorful. Serve it hot to enjoy!'
    },
    {
      receipe:'Rice',
      img:'https://image.shutterstock.com/image-photo/white-rice-bowl-260nw-560830615.jpg',
      description:'Rinse the rice and drain it.Pour the specified amount of water into a saucepan, cover, then bring to a boil (use about 2-2½ cups of water per cup of rice). Add the rice and salt. Cover and cook over very low heat about 15 min without uncovering.Remove the saucepan from the heat. The water should be completely absorbed. Should it not be, cover and simmer for a few more minutes. Let stand, covered, 3-5 min. Serve.'
    }
  ];
  sendeceipe(res){
    this.receipeData=res;
  }
  ngOnInit() {
  }

}
