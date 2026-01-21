/*Campus Walk
Decide whether to go out to class, if it is raining and you do not have an umbrella, return "STAY_HOME", otherwise return "GO_OUT".
Examples:
campusWalk(false, false)
→ GO_OUT
campusWalk(true, false)
→ STAY_HOME
campusWalk(false, true)
→ GO_OUT */

public String campusWalk(boolean isRaining, boolean hasUmbrella) {
    if(isRaining&&!hasUmbrella){
        String s="STAY_HOME";
        return s;
    }
    else if(isRaining&&hasUmbrella){
String v="GO_OUT";
        return v;
    }
    else{
        String b="GO_OUT";
        return b;
    }
}
