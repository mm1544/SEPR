package com.mygdx.game;
public class Phase {

  public Integer PhaseNumber;

  private Integer TimeLeft;

  private Integer StartTime;

  public Phase(Integer PhaseNumber, Integer StartTime){
      this.PhaseNumber = PhaseNumber;
      this.StartTime = StartTime;
      this.TimeLeft = this.StartTime;
  }
  public void ReduceTime() {
  }

  public void ResetTime() {
    this.TimeLeft = this.StartTime;
  }

}