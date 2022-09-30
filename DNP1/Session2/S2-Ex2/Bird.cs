namespace S2_Ex2;

public class Bird
{
    static string _birdVisual = "Bird flaps wings";
    static string _birdSound = "Chip chirip";
    static string _birdDance = "Bird does mating dance";
    List<string> _test = new List<string>{ _birdVisual, _birdSound, _birdDance };

    public delegate void BirdWatcherReaction();

    public delegate void BlindWatcherReaction();

    public delegate void DeafWatcherReaction();

    
    
    static BirdWatcher _pavel = new BirdWatcher();
    
    BirdWatcherReaction _normal = _pavel.NormalBirdWatcher;
    BlindWatcherReaction _blind = _pavel.BlindBirdWatcher;
    DeafWatcherReaction _deaf = _pavel.DeafBirdWatcher;
    public string BirdAction(int id)
    {
        return _test[id];
    }
    public void BirdBehaviour()
    {
        
        while (true)
        {

            int index = new Random().Next(_test.Count);
            Console.WriteLine(BirdAction(index));

            if (index == 0)
            {
                _normal.Invoke();
            }
            else if (index == 1)
            {
                _blind.Invoke();
            }
            else
            {
                _deaf.Invoke();
            }
            Thread.Sleep(4000);
        }
    }
}