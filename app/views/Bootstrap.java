package views;

import java.util.List;

import play.*;
import play.jobs.*;
import play.test.*;

import models.*;

@OnApplicationStart
public class Bootstrap extends Job
{
    public void doJob()
    {
        if (Member.count() == 0)
        {
            Fixtures.loadModels("data.yml");
        }
    }
}