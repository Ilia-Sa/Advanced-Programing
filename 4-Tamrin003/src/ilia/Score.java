/*I was able to create the getter and setter methods for the program,
* however I was unable to use them.
 */

package ilia;

import java.util.ArrayList;
import java.util.List;


public class Score {
    private List<Integer> scores;
    public Score(){

    }
    public List<Integer> getScores() {
        return this.scores;
    }
    public void setScores(List<Integer> scores ) {
        this.scores = scores;
    }
}

