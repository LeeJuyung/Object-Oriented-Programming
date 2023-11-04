package org.object_code.object;

import java.util.Stack;

public class MyGraph {
	int vertexCnt; //노드 갯수
	int[][]m; //그래프 저장용 배열
	boolean[]visit; //방문여부 저장용 배열
	
	public MyGraph(int N) {
		vertexCnt = N;
		m=new int [N][N];
		visit=new boolean[N]; //초기화
	}
	public void addEdge(int from, int to) {
		m[from][to]=1;
		m[to][from]=1;
	}
	public void dfsRecursion(int v) {
		Stack<Integer> st=new Stack<>();
		st.push(v);
		visit[v]=true;
		System.out.print(v+" ");
		
		while(!st.isEmpty()) { //스택이 빌 때가지 반복
			int now= st.peek(); //0을 넣고 시작함 스택에 현재 가장 마지막에 입력된 노드
			boolean flag = false; //방문할 곳이 남았는지 체크하는 노드
			
			for(int i=0;i<vertexCnt;i++) {
				if(m[now][i]==1&&!visit[i]){
					visit[i]=true;//연결된 곳 중 방문하지 않은 노드 확인
					flag = true;//방문할 노드가 있는 곳으로 변경
					st.push(i);//해당 노드를 스택에 저장
					System.out.print(i+" ");
					break;
				}
				
			}
			if(!flag) { //방문할 곳이 한 군데도 없다면
				st.pop(); //스택에서 현재 노드 제거
			}
		}
		
	}


	public static void main(String[] args) {
		MyGraph mg = new MyGraph(8);
		mg.addEdge(0, 1);
		mg.addEdge(0, 2);
		mg.addEdge(0, 3);
		mg.addEdge(1, 4);
		mg.addEdge(1, 5);
		mg.addEdge(2, 6);
		mg.addEdge(3, 6);
		mg.addEdge(3, 7);
		//mg.dfsStack(0);
		mg.dfsRecursion(0);
	}

}
