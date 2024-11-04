package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ade {
    public final Object a = new Object();
    public List b = new ArrayList();
    public List c = new ArrayList();
    public boolean d = true;

    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            z = this.d;
        }
        return z;
    }
}
