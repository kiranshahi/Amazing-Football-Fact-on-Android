package com.kirans.user.amazingfacts;

import java.util.Random;

/**
 * Created by User on 7/8/2015.
 */
public class FactBook {

    public String[] facts= {
            "Cameroonian professional footballer Alex Song has 27 siblings 17 sisters and 10 brothers.",
            "Liverpool keeper Simon Mignolet speaks 5 languages and has a degree in politics.",
            "Dundee United have played and beaten Barcelona 4 times in professional fixtures, giving them a 100% win record.",
            "Former Manchester United player Alan Smith scored vs Sheffield United in a League One fixture in April 2012. His previous goal in all competitions was against AS Roma in the Champions League in a 7-1 win for Manchester United.",
            "There is only one team out of the 4 divisions in England and the 4 divisions in Scotland that have a \'j\' in their name. It\'s Saint Johnstone.",
            "Ronaldo (the Brazilian) has never won the Champions League despite playing for 5 teams that did. Zlatan Ibrahimovic has also never won the Champions League.",
            "Manuel Neuer stars in the German version of the 2013 Disney/Pixar film\' Monsters University\'. He provides the voice for the character Frank McCay.",
            "Former Liverpool man Charlie Adam is younger than Cristiano Ronaldo.",
            "The first English team to win a European trophy is West Auckland Town FC. They won the Sir Thomas Lipton trophy, one of football\'s first European competitions, twice in 1909 and 1911.",
            "Only one country has had two cities with two teams reach the semi finals of the European Cup/Champions League. Scotland Dundee (with Dundee in 1963 and Dundee United in 1984) and Glasgow (with Celtic in 1967, 1970, 1972 & 1974 and Rangers in 1960).",
            "Kuba Blaszczykowski watched his father stab his mother to death when he was 10 years old.",
            "Gary Lineker pooped his pants whilst playing against Ireland at the 1990 World Cup.",
            "Real Madrid Luka Modric and Mark Viduka are cousins.",
            "There is only one case of Balotelli missing a penalty on camera and it\'s in training.",
            "Rio Mavuba was born in international waters. His birth certificate does not have a nation listed, it just says \"Born at sea\".",
            "The younger brother of Joey Barton, Michael, is a convicted murderer. He murdered his victim with an ice axe.",
            "Steve Finnan (former Liverpool right back) played in the Conference, Division 3, Division 2, Division 1, the Premiership, the World Cup, the Champions League Final, the UEFA Cup Final, the FA Cup Final, the League Cup Final, the Club World Cup Final, the Super Cup and the Intertoto during his career.",
            "Xabi Alonso enjoys Gaelic Football.",
            "Javier Zanetti didn\'t get a red card in Serie A til his 548th match. Ryan Giggs has never received a red card in the EPL.",
            "Former Tottenham Hotspur player David Ginola has an unfortunate tale to tell. His name is an anagram for Vagina Dildo.",
            " Ronaldinho first gained media attention when his youth team won a game 23-0. He scored every single goal.",
            "Eden Hazard has a son named Leo. Garry Cahill has a son named Leo. Fernando Torres has a son named Leo. There is a lion in the Chelsea FC crest. Leo is the Latin word for lion.",
            "Mark Hughes once played two games in a single day; In the morning he played for Wales against Czechoslovakia in Prague, drove across the border, and then turned out for Bayern Munich in the afternoon.",
            "Former Tottenham Hotspur captain Ledley King holds the record for the quickest Premier League goal. He scored 10 seconds after kick-off in a match against Bradford in the 2000/01 season",
            "England came up with the word soccer. It\'s a shortened version of \"Association Football\" which got changed to \"Assoc Football\" which then got changed to \"Soccer\". In 19th century England, it was popular to add the \"er\" sound to shortened words.",
            "Arsene Wenger has an asteroid named after him called 33179 Arsénewenger.",
            "AC Milan was actually founded as a cricket team.",
            "The first black and white jersey that Juventus wore was a Notts County kit that was brought in by an importer. It has become a tradition since then.",
            "Gary and Phil Neville\'s father is called Neville Neville.",
            "Between 2001 and 2003, Bundesliga club Fortuna Düsseldorf were sponsored by Toten Hosen, one the biggest rock bands in Germany.",
            "Maynor Figueroa has three toes on his left foot. He can still do this.",
            "There are only two football teams in the Isles of Scilly The Gunners and the Wanderers. They play each other every week in the league, the only break being when they meet in the Cup. Talk about boring!",
            "Didier Drogba is not just a footballer in his home country, and helped stop a civil war in Ivory Coast after qualifying for the World Cup.",
            "Fernando d\'Ercoli, while playing for Pianta in 1989, got so mad after getting a red card that he snatched the card from the referee\'s hand and ate it. Similarly, Mike Bagley took the referee’s notebook and ripped out the page with his name on after he had been booked, and ate it.",
            "Brazilian striker Ronaldo got this ridiculous haircut at the 2002 World Cup so that his son would be able to distinguish him from the other bald Brazilian players on TV.",
            "Zlatan Ibrahimovic used to be a bike thief when he was younger.",
            "The Borussia in Borussia Dortmund comes from a brand of beer in Dortmund.",
            "According to Mexico City police, crime rates in Mexico reduce when Javier Hernandez plays football. Additionally, and almost unbelievably, they suggest that more women go into labor than usual when the Manchester United striker plays.",
            "Zinedine Zidane almost joined Blackburn Rovers. However, the club chose Tim Sherwood instead, with chairman Jack Walker saying: \"Who needs Zinedine Zidane? We\'ve got Tim Sherwood.\"",
            "Osama bin Laden was said to be a massive Arsenal fan.",
            " Arthur Conan Doyle, the author of the Sherlock Holmes series, played keeper for Portsmouth under the name AC Smith.",
            "Dennis Bergkamp would miss away matches because he had a fear of flying, which is why he was called the Non-Flying Dutchman.",
            "When Harry Redknapp was assistant manager at West Ham, he heard a fan abusing striker Lee Chapman during a pre-season friendly against Oxford City. At half time, he asked the fan to get dressed in the kit and play for the team if he thought he could do better. The fan took up his challenge, played through the second half, and even scored a goal.",
            "Garrincha was born with an illness that should have made it impossible for him to walk. Instead, he became incredibly flecible and agile, which helped him while playing football.",
            "Santiago Cañizares once tore a tendon in his foot while trying to break the fall of a perfume bottle the way he would control a football. He had to miss the World Cup because of the freak injury.",
            " Robert Lewandowski almost signed for Blackburn Rovers, but a giant ash cloud from Iceland grounded his plane and delayed his transfer. It didn\'t happen thereafter.",
            "Stuart Holden used to play competitive Counter-Strike.",
            "Simon Mignolet started his career as a forward, and tried his hand at being a goalkeeper after he was dropped. On the other hand, Fernando Torres started his career as a goalkeeper, and later switched to become a striker (No wonder he became so good at keeping the ball out of the goal).",
            " Diego Maradona once played for Tottenham Hotspur.",
            "Dimitar Berbatov\'s childhood hero was Alan Shearer, and he used to sleep in a Newcastle shirt when he was young.",
    };

    public String fact(){



        // When the button is clicked lets update the facts
        String fact = "";
        //Randomly select a fact
        Random randomGenerator = new Random(); //Construct a new random number generator

        int randomNumber = randomGenerator.nextInt(facts.length);

        fact = facts[randomNumber];
        return fact;
    }
}
