namespace S2_Ex4;

public class WaitingRoom
{
    public Action<int> NumberChange = null!;
    private int _currentNumber = 0;
    private int _ticketCount = 0;

    public void RunWaitingRoom()
    {
        
        while (_currentNumber < _ticketCount)
        {
            NumberChange(++_currentNumber);
            
        }
    }

    public int DrawNumber()
    {
        _ticketCount++;
        return _ticketCount;
    }
}