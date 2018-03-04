CFLAGS = -Wall -fpic -coverage -lm

rngs.o: rngs.h rngs.c
	gcc -c rngs.c -g  $(CFLAGS)

dominion.o: dominion.h dominion.c rngs.o
	gcc -c dominion.c -g  $(CFLAGS)

playdom: dominion.o playdom.c
	gcc -o playdom playdom.c -g dominion.o rngs.o $(CFLAGS)
#To run playdom you need to entere: ./playdom <any integer number> like ./playdom 10*/
testDrawCard: testDrawCard.c dominion.o rngs.o
	gcc  -o testDrawCard -g  testDrawCard.c dominion.o rngs.o $(CFLAGS)

badTestDrawCard: badTestDrawCard.c dominion.o rngs.o
	gcc -o badTestDrawCard -g  badTestDrawCard.c dominion.o rngs.o $(CFLAGS)

testBuyCard: testDrawCard.c dominion.o rngs.o
	gcc -o testDrawCard -g  testDrawCard.c dominion.o rngs.o $(CFLAGS)

testAll: dominion.o testSuite.c
	gcc -o testSuite testSuite.c -g  dominion.o rngs.o $(CFLAGS)

interface.o: interface.h interface.c
	gcc -c interface.c -g  $(CFLAGS)

runtests: testDrawCard 
	./testDrawCard &> unittestresult.out
	gcov dominion.c >> unittestresult.out
	cat dominion.c.gcov >> unittestresult.out

teammateTest: unittest1.c unittest2.c unittest3.c unittest4.c cardtest1.c cardtest2.c cardtest3.c cardtest4.c dominion.o rngs.o
	echo "Assignment 5 Teammate Test Results:" > teammateResults.out
	echo "" >> teammateResults.out

	echo "Assignment 5 Coverage results:" > Assign5Cov.out
	echo "" >> Assign5Cov.out

	echo "--------------------------------------------------" >> teammateResults.out
	echo "unittest1.c: discardCard()" >> teammateResults.out
	gcc -o unittest1 unittest1.c dominion.o rngs.o $(CFLAGS)
	unittest1 >> teammateResults.out
	echo "" >> teammateResults.out

	echo "unittest1 Coverage:" >> Assign5Cov.out
	gcov -abcfu dominion.c >> Assign5Cov.out
	echo "--------------------------------------------------" >> Assign5Cov.out

	echo "--------------------------------------------------" >> teammateResults.out
	echo "unittest2.c: gainCard()" >> teammateResults.out
	gcc -o unittest2 unittest2.c dominion.o rngs.o $(CFLAGS)
	unittest2 >> teammateResults.out
	echo "" >> teammateResults.out

	echo "unittest2 Coverage:" >> Assign5Cov.out
	gcov -abcfu dominion.c >> Assign5Cov.out
	echo "--------------------------------------------------" >> Assign5Cov.out

	echo "--------------------------------------------------" >> teammateResults.out
	echo "unittest3.c: isGameOver()" >> teammateResults.out
	gcc -o unittest3 unittest3.c dominion.o rngs.o $(CFLAGS)
	unittest3 >> teammateResults.out
	echo "" >> teammateResults.out

	echo "unittest3 Coverage:" >> Assign5Cov.out
	gcov -abcfu dominion.c >> Assign5Cov.out
	echo "--------------------------------------------------" >> Assign5Cov.out

	echo "--------------------------------------------------" >> teammateResults.out
	echo "unittest4.c: fullDeckCount()" >> teammateResults.out
	gcc -o unittest4 unittest4.c dominion.o rngs.o $(CFLAGS)
	unittest4 >> teammateResults.out
	echo "" >> teammateResults.out

	echo "unittest4 Coverage:" >> Assign5Cov.out
	gcov -abcfu dominion.c >> Assign5Cov.out
	echo "--------------------------------------------------" >> Assign5Cov.out

	echo "--------------------------------------------------" >> teammateResults.out
	echo "cardtest1.c: Adventurer" >> teammateResults.out
	gcc -o cardtest1 cardtest1.c dominion.o rngs.o $(CFLAGS)
	cardtest1 >> teammateResults.out
	echo "" >> teammateResults.out

	echo "cardtest1 Coverage:" >> Assign5Cov.out
	gcov -abcfu dominion.c >> Assign5Cov.out
	echo "--------------------------------------------------" >> Assign5Cov.out

	echo "--------------------------------------------------" >> teammateResults.out
	echo "cardtest2.c: Smithy" >> teammateResults.out
	gcc -o cardtest2 cardtest2.c dominion.o rngs.o $(CFLAGS)
	cardtest2 >> teammateResults.out
	echo "" >> teammateResults.out

	echo "cardtest2 Coverage:" >> Assign5Cov.out
	gcov -abcfu dominion.c >> Assign5Cov.out
	echo "--------------------------------------------------" >> Assign5Cov.out

	echo "--------------------------------------------------" >> teammateResults.out
	echo "cardtest3.c: Sea_Hag" >> teammateResults.out
	gcc -o cardtest3 cardtest3.c dominion.o rngs.o $(CFLAGS)
	cardtest3 >> teammateResults.out
	echo "" >> teammateResults.out

	echo "cardtest3 Coverage:" >> Assign5Cov.out
	gcov -abcfu dominion.c >> Assign5Cov.out
	echo "--------------------------------------------------" >> Assign5Cov.out

	echo "--------------------------------------------------" >> teammateResults.out
	echo "cardtest4.c: Steward" >> teammateResults.out
	gcc -o cardtest4 cardtest4.c dominion.o rngs.o $(CFLAGS)
	cardtest4 >> teammateResults.out
	echo "" >> teammateResults.out

	echo "cardtest4 Coverage:" >> Assign5Cov.out
	gcov -abcfu dominion.c >> Assign5Cov.out
	echo "--------------------------------------------------" >> Assign5Cov.out

	echo "--------------------------------------------------" >> teammateResults.out
	echo "randomtestadventurer.c: Adventurer" >> teammateResults.out
	gcc -o randtest1 randomtestadventurer.c dominion.o rngs.o $(CFLAGS)
	randtest1 >> teammateResults.out
	echo "" >> teammateResults.out

	echo "randomtestadventurer Coverage:" >> Assign5Cov.out
	gcov -abcfu dominion.c >> Assign5Cov.out
	echo "--------------------------------------------------" >> Assign5Cov.out

	echo "--------------------------------------------------" >> teammateResults.out
	echo "randomtestcard1.c: Salvager" >> teammateResults.out
	gcc -o randtest2 randomtestcard1.c dominion.o rngs.o $(CFLAGS)
	randtest2 >> teammateResults.out
	echo "" >> teammateResults.out

	echo "randomtestcard1 Coverage:" >> Assign5Cov.out
	gcov -abcfu dominion.c >> Assign5Cov.out
	echo "--------------------------------------------------" >> Assign5Cov.out
	
	echo "--------------------------------------------------" >> teammateResults.out
	echo "randomtestcard2.c: Steward" >> teammateResults.out
	gcc -o randtest3 randomtestcard2.c dominion.o rngs.o $(CFLAGS)
	randtest3 >> teammateResults.out
	echo "" >> teammateResults.out

	echo "randomtestcard2 Coverage:" >> Assign5Cov.out
	gcov -abcfu dominion.c >> Assign5Cov.out
	echo "--------------------------------------------------" >> Assign5Cov.out

unittestresults.out: unittest1.c dominion.o rngs.o
	echo "Assignment 3 Unit Testing Results:" > unittestresults.out

	echo "unittest1.c" >> unittestresults.out
	gcc -o unittest1 unittest1.c dominion.o rngs.o $(CFLAGS)
	unittest1 >> unittestresults.out
	gcov -abcfu dominion.c >> unittestresults.out

	echo "unittest2.c" >> unittestresults.out
	gcc -o unittest2 unittest2.c dominion.o rngs.o $(CFLAGS)
	unittest2 >> unittestresults.out
	gcov -abcfu dominion.c >> unittestresults.out

	echo "unittest3.c" >> unittestresults.out
	gcc -o unittest3 unittest3.c dominion.o rngs.o $(CFLAGS)
	unittest3 >> unittestresults.out
	gcov -abcfu dominion.c >> unittestresults.out

	echo "unittest4.c" >> unittestresults.out
	gcc -o unittest4 unittest4.c dominion.o rngs.o $(CFLAGS)
	unittest4 >> unittestresults.out
	gcov -abcfu dominion.c >> unittestresults.out

	echo "cardtest1.c" >> unittestresults.out
	gcc -o cardtest1 cardtest1.c dominion.o rngs.o $(CFLAGS)
	cardtest1 >> unittestresults.out
	gcov -abcfu dominion.c >> unittestresults.out

	echo "cardtest2.c" >> unittestresults.out
	gcc -o cardtest2 cardtest2.c dominion.o rngs.o $(CFLAGS)
	cardtest2 >> unittestresults.out
	gcov -abcfu dominion.c >> unittestresults.out

	echo "cardtest3.c" >> unittestresults.out
	gcc -o cardtest3 cardtest3.c dominion.o rngs.o $(CFLAGS)
	cardtest3 >> unittestresults.out
	gcov -abcfu dominion.c >> unittestresults.out

	echo "cardtest4.c" >> unittestresults.out
	gcc -o cardtest4 cardtest4.c dominion.o rngs.o $(CFLAGS)
	cardtest4 >> unittestresults.out
	gcov -abcfu dominion.c >> unittestresults.out

randomtests: randomtestcard1.c randomtestcard2.c randomtestadventurer.c dominion.o rngs.o
	echo "randomtestcard1.c" >> randomtestcard1.out
	gcc -o randtest1 randomtestcard1.c dominion.o rngs.o $(CFLAGS)
	randtest1 >> randomtestcard1.out
	gcov -abcfu dominion.c >> randomtestcard1.out

	echo "randomtestcard2.c" >> randomtestcard2.out
	gcc -o randtest2 randomtestcard2.c dominion.o rngs.o $(CFLAGS)
	randtest2 >> randomtestcard2.out
	gcov -abcfu dominion.c >> randomtestcard2.out

	echo "randomtestadventurer.c" >> randomtestadventurer.out
	gcc -o randomtestadventurer randomtestadventurer.c dominion.o rngs.o $(CFLAGS)
	randomtestadventurer >> randomtestadventurer.out
	gcov -abcfu dominion.c >> randomtestadventurer.out

player: player.c interface.o
	gcc -o player player.c -g  dominion.o rngs.o interface.o $(CFLAGS)

all: playdom player testDrawCard testBuyCard badTestDrawCard unittest1

clean:
	rm -f *.o playdom.exe playdom player player.exe randtest1 randtest2 randtest3 randomtestadventurer unittest1 unittest2 unittest3 unittest4 cardtest1 cardtest2 cardtest3 cardtest4 *.gcov *.gcda *.gcno *.so *.out testDrawCard testDrawCard.exe
