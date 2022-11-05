package CCC21_teaching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class CCC2019J5_RuleOfThree {

	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<Rule> rules = new ArrayList<Rule>();
	public static ArrayList<Rule> rulesReversed = new ArrayList<Rule>();
	
//	31AB
//	42BBA
//	firstHalfSequence.put("BBA", "31AB, 42BBA");
	
	public static ArrayList<String> firstHalfResults = new ArrayList<String>();
	public static HashMap<String, ArrayList<SequenceStep>> firstHalfSequences = 
			new HashMap<String, ArrayList<SequenceStep>>();
	
	public static ArrayList<String> secondHalfResults = new ArrayList<String>();
	public static HashMap<String, ArrayList<SequenceStep>> secondHalfSequences = 
			new HashMap<String, ArrayList<SequenceStep>>();
	
	public static int firstHalfSteps;
	public static int secondHalfSteps;
	
	public static boolean finished = false;
	
	public static class Rule {
		String from;
		String to;
		int ruleNum;
		
		public Rule(String from, String to, int ruleNum) {
			this.from = from;
			this.to = to;
			this.ruleNum = ruleNum;
		}
	}
	
	public static class SequenceStep {
		int ruleNum;
		int startReplacingIndex;
		String result;
		
		public SequenceStep(int ruleNum, int startReplacingIndex, String result) {
			this.ruleNum = ruleNum;
			this.startReplacingIndex = startReplacingIndex;
			this.result = result;
		}
	}
	
	public static void RecurSub(String start, int currentCycle, 
			ArrayList<SequenceStep> accumulatingStep,
			ArrayList<Rule> rules,
			boolean isFirstHalf) {
		if (finished) return;
		if (currentCycle > (isFirstHalf? firstHalfSteps : secondHalfSteps)) return;
		currentCycle++;
		for (int i = 0; i < start.length(); i++) {
			for (int j = i+1; j < start.length() + 1; j++) {
				if (isFirstHalf) {
					for (Rule rule : rules) {
						if (start.substring(i, j).contentEquals(rule.from)) {
							String next = start.substring(0, i) +
									rule.to +
									start.substring(j, start.length());
							ArrayList<SequenceStep> newAccumulatingStep = (ArrayList<SequenceStep>) accumulatingStep.clone();
							newAccumulatingStep.add(new SequenceStep(rule.ruleNum, i + 1, next));
							if (currentCycle == firstHalfSteps) {
								if (!firstHalfResults.contains(next)) {
									firstHalfResults.add(next);
									firstHalfSequences.put(next, newAccumulatingStep);
								}
							}
							RecurSub(next, currentCycle, newAccumulatingStep, rules, isFirstHalf);
						}
					}
				} else {
					for (Rule rule : rulesReversed) {
						if (start.substring(i, j).contentEquals(rule.from)) {
							String next = start.substring(0, i) +
									rule.to +
									start.substring(j, start.length());
							ArrayList<SequenceStep> newAccumulatingStep = (ArrayList<SequenceStep>) accumulatingStep.clone();
							newAccumulatingStep.add(new SequenceStep(rule.ruleNum, i + 1, start));
							if (currentCycle == secondHalfSteps) {
								if (firstHalfResults.contains(next)) {
									secondHalfResults.add(next);
									secondHalfSequences.put(next, newAccumulatingStep);
									finished = true;
								}
							}
							RecurSub(next, currentCycle, newAccumulatingStep, rules, isFirstHalf);
						}
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		//Receive the rules
		for (int i = 0; i < 3; i++) {
			String[] line = sc.nextLine().split(" ");
			rules.add(new Rule(line[0], line[1], i + 1));
			rulesReversed.add(new Rule(line[1], line[0], i + 1));
		}

		String[] line = sc.nextLine().split(" ");
		firstHalfSteps = (int)(Integer.valueOf(line[0]) / 2);
		secondHalfSteps = Integer.valueOf(line[0]) - firstHalfSteps;
		
		String start = line[1];
		String end = line[2];
		
		//Run recursively!
		RecurSub(start, 0, new ArrayList<SequenceStep>(), rules, true);
		RecurSub(end, 0, new ArrayList<SequenceStep>(), rulesReversed, false);
		
		boolean found = false;
		for (String result1 : firstHalfResults) {
			if (found) break;
			for (String result2: secondHalfResults) {
				if (result1.contentEquals(result2)) {
					//Print all the steps
					for (SequenceStep s1 : firstHalfSequences.get(result1))
						System.out.println(s1.ruleNum + " " + 
								s1.startReplacingIndex + " " + 
								s1.result);
					ArrayList<SequenceStep> steps2 = secondHalfSequences.get(result2);
					Collections.reverse(steps2);
					for (SequenceStep s2 : steps2)
						System.out.println(s2.ruleNum + " " + 
								s2.startReplacingIndex + " " + 
								s2.result);
					found = true;
					break;
				}
			}
		}
	}
	
	
	

}



















//public static void RecurSub(String start, int currenCycle, ArrayList<String> accumulatingStep, 
//ArrayList<String> rule) {
//
//
///*
//* increment current cycle
//* If current Cycle is over or equal to step limit, return
//* Loop through every character in start -> i
//* 		nested Loop through every character in start as End -> j
//* 			Gather substring start[i:j]
//* 			Check if any rule can be applied to start[i:j] 
//* 				If can apply, apply and replace the portion with rule
//* 				Add step to accumulatingStep list
//* 				Add the result step and sequence to our lists
//* 				Recursively Calls RecurSub()
//*/
//
//}
