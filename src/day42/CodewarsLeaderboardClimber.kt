package day42

object CodewarsLeaderboardClimber {
    fun leaderBoard(user:String, userScore:Int, yourScore:Int):String {
        val i = userScore-yourScore; val x = i.div(3); val y = i.rem(3)/1
        val result =  "To beat $user's score, I must complete $x Beta kata and $y 8kyu kata."
        return if (i<0) "Winning!" else if (i==0) "Only need one!"
        else if(x+y>1000) "$result Dammit!" else result
    }
}