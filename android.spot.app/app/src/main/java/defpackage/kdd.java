package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdd {
    public static final Logger a = Logger.getLogger(kdd.class.getName());
    private static final AtomicBoolean b = new AtomicBoolean(false);

    private kdd() {
    }

    public static boolean a() {
        if (b.get()) {
            return true;
        }
        return false;
    }
}
