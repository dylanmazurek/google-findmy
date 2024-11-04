package defpackage;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqi implements jpz {
    public final String a;
    public final Level b;
    public final boolean c;
    public final Set d;
    public final jph e;
    public final int f;
    private volatile jqj g;

    public jqi(int i, Level level, boolean z, Set set, jph jphVar) {
        this.a = "";
        this.f = 2;
        this.b = level;
        this.c = z;
        this.d = set;
        this.e = jphVar;
    }

    @Override // defpackage.jpz
    public final jow a(String str) {
        if (this.c && str.contains(".")) {
            jqj jqjVar = this.g;
            if (jqjVar == null) {
                synchronized (this) {
                    jqjVar = this.g;
                    if (jqjVar == null) {
                        jqjVar = new jqj(null, 2, this.b, false, this.d, this.e);
                        this.g = jqjVar;
                    }
                }
            }
            return jqjVar;
        }
        return new jqk(str, 2, this.b, this.d, this.e);
    }

    private jqi() {
        this(2, Level.ALL, false, jqk.a, jqk.b);
    }
}
