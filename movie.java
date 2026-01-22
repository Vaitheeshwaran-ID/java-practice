// Movie
// It's the weekend and you are deciding whether to watch a movie or rest, watch the movie only if it is the weekend and you are not tired; otherwise, rest. Return the appropirate string value.
// Examples:
// movie(false, false)
// → REST
// movie(true, false)
// → WATCH
// movie(false, true)
// → REST

public String movie(boolean isWeekend, boolean isTired) {
    // if it's weekend AND you are NOT tired -> WATCH
    // otherwise -> REST
    if(isWeekend&&!isTired){
String a="WATCH";
 return a;}
 else if(isTired&&isWeekend){
String b="REST";
return b;}
else{
    String d="REST";
    return d;
}
 }
    
