package org.object_code.object;

import java.util.LinkedList;
import java.util.Queue;

public class MyGraph2 {
	int vertexCnt; //노드 갯수
	int[][]m; //그래프 저장용 배열
	boolean[]visit; //방문여부 저장용 배열
	
	public MyGraph2(int N) {
		vertexCnt = N;
		m=new int [N][N];
		visit=new boolean[N]; //초기화
	}
	public void makeUndirectedEdge(int from, int to) {
		m[from][to]=1;
		m[to][from]=1;
	}
	public void bfs(int v) {
		Queue<Integer> q=new LinkedList<>();
		q.offer(v);
		visit[v]=true;
		
		while(!q.isEmpty()) { //스택이 빌 때가지 반복
			int now= q.poll(); //0을 넣고 시작함 스택에 현재 가장 마지막에 입력된 노드
			System.out.print(now+" ");
			
			for(int i=0;i<vertexCnt;i++) {
				if(m[now][i]==1&&!visit[i]){
					visit[i]=true;//연결된 곳 중 방문하지 않은 노드 확인
					q.offer(i);//해당 노드를 스택에 저장
				}
				
			}
		}
		
	}

	public static void main(String[] args) {
		MyGraph2 mg = new MyGraph2(8);
		mg.makeUndirectedEdge(0, 1);
		mg.makeUndirectedEdge(0, 2);
		mg.makeUndirectedEdge(0, 3);
		mg.makeUndirectedEdge(1, 4);
		mg.makeUndirectedEdge(1, 5);
		mg.makeUndirectedEdge(2, 6);
		mg.makeUndirectedEdge(3, 6);
		mg.makeUndirectedEdge(3, 7);
		mg.bfs(0);
	}

}
