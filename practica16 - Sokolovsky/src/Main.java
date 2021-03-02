#include <fstream>
#include <iostream>


const int maxn = 100;
        int n, i, s, min, count, found;
        int a[maxn][maxn];
        int m[maxn], minm[maxn];
        void _input(){
        std::ifstream fin("input.txt");
        fin >> n;
        for (int i = 1; i <= n; i++)
        for (int j = 1; j <= n; j++) {
        fin >> a[i][j];
        }
        }
        void _output()
        {
        std::ofstream fout("output.txt");
        if (found)
        {
        std::cout << "Ìèíèìàëüíàÿ äëèíà ïóòè = " << min << std::endl;
        std::cout << "Ïóòü : ";
        int c = 1;
        for (int i = 1; i <= n; i++)
        {
        int j = 1;
        while ((j <= n) && (minm[j] != c))
        j++;
        std::cout << j << "->";
        c++;
        }
        std::cout << minm[1] << std::endl;
        }
        else  std::cout << "Ïóòü íå íàéäåí!";
        }
        void search(int x)

        {
        if ((count == n) &&
        (a[x][1] != 0) &&
        (s + a[x][1] < min))
        {
        found = 1;
        min = s + a[x][1];
        for (int i = 1; i <= n; i++)minm[i] = m[i];
        }
        else
        {
        for (int i = 1; i <= n; i++)
        if ((i != x) &&
        (a[x][i] != 0) &&
        (m[i] == 0) &&
        (s + a[x][i] < min))
        {
        s += a[x][i];
        count++;
        m[i] = count;
        search(i);
        m[i] = 0;
        count--;
        s -= a[x][i];
        }
        }
        }
        void run()
        {
        s = 0;
        found = 0;
        min = 32767;
        for (int i = 1; i <= n; i++) m[i] = 0;
        count = 1;
        m[1] = count;
        search(1);
        }
        void main()
        {
        setlocale(LC_ALL, "Russian");
        _input();
        run();
        _output();
        std::cin.get();
        }