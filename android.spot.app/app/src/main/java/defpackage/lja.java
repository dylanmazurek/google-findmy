package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class lja {
    public static final lja a = new lja(null);
    private static volatile boolean b = false;
    private static volatile lja c;
    private final Map d;

    lja() {
        this.d = new HashMap();
    }

    public static lja a() {
        lja ljaVar = c;
        if (ljaVar != null) {
            return ljaVar;
        }
        synchronized (lja.class) {
            lja ljaVar2 = c;
            if (ljaVar2 != null) {
                return ljaVar2;
            }
            lkz lkzVar = lkz.a;
            lja b2 = ljg.b(lja.class);
            c = b2;
            return b2;
        }
    }

    public nqe b(lkq lkqVar, int i) {
        return (nqe) this.d.get(new liz(lkqVar, i));
    }

    public lja(byte[] bArr) {
        this.d = Collections.emptyMap();
    }
}
