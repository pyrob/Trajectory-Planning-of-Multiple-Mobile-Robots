package tt.jointtraj.solver;

import tt.euclid2i.EvaluatedTrajectory;

public class SearchResult{
    public EvaluatedTrajectory[] trajectories;
    public boolean finished;

    public SearchResult(EvaluatedTrajectory[] trajectories, boolean finished) {
        super();
        this.trajectories = trajectories;
        this.finished = finished;
    }

    public boolean isFinished() {
        return finished;
    }

    public EvaluatedTrajectory[] getTrajectories() {
        return trajectories;
    }

    public boolean foundSolution() {
        return trajectories != null;
    }
}
