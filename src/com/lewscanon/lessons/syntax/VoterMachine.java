package com.lewscanon.lessons.syntax;

class MessageException extends Exception
{
    MessageException(String msg)
    {
        super(msg);
    }
}

class VoterMachine {
    public void age(int number) throws MessageException
    {
        if(number>=18)
        {
            System.out.print("Candidate is right to Vote");
        }
        else
        {
            throw new MessageException("Candidate is under-age");
        }
    }
    public static void main(String[] args) {
        VoterMachine voter = new VoterMachine();
        try{
            voter.age(17);
        }catch(MessageException e)
        {
            System.out.printf("%s%n", e);
        }
    }
}
