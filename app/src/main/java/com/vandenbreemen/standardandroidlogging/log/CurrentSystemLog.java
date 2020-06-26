package com.vandenbreemen.standardandroidlogging.log;

/**
 * API for logging into various subsystems
 * Created by kevin
 */
public interface CurrentSystemLog {

    public abstract void info(String message, Object... args);

    public abstract void error(String message, Throwable throwable, Object... args);

    public abstract void error(String message, Object... args);

    public abstract void debug(String message, Object... args);

    public abstract void warn(String message, Object... args);
}
