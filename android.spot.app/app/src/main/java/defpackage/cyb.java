package defpackage;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyb {
    public Map a;
    public Map b;
    public Map c;
    public List d;
    public tb e;
    public sl f;
    public List g;
    public Rect h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public final cww n = new cww();
    private final HashSet o = new HashSet();
    public int m = 0;

    public final float a() {
        return (b() / this.k) * 1000.0f;
    }

    public final float b() {
        return this.j - this.i;
    }

    public final dbp c(String str) {
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            dbp dbpVar = (dbp) this.d.get(i);
            if (!dbpVar.a.equalsIgnoreCase(str)) {
                if (dbpVar.a.endsWith("\r")) {
                    if (!dbpVar.a.substring(0, r4.length() - 1).equalsIgnoreCase(str)) {
                    }
                }
            }
            return dbpVar;
        }
        return null;
    }

    public final dcx d(long j) {
        return (dcx) this.f.e(j);
    }

    public final void e(String str) {
        deu.a(str);
        this.o.add(str);
    }

    public final void f(int i) {
        this.m += i;
    }

    public final void g() {
        this.l = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            sb.append(((dcx) it.next()).a("\t"));
        }
        return sb.toString();
    }
}
