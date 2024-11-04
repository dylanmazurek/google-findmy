package defpackage;

import android.util.Log;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqj extends jpx {
    private final Level a;
    private final boolean b;
    private final Set c;
    private final jph d;
    private final int e;

    public jqj(String str, int i, Level level, boolean z, Set set, jph jphVar) {
        super(str);
        this.e = 2;
        this.a = level;
        this.b = z;
        this.c = set;
        this.d = jphVar;
    }

    @Override // defpackage.jow
    public final void c(jov jovVar) {
        String str = (String) jovVar.l().d(jop.a);
        if (str == null) {
            str = a();
        }
        if (str == null) {
            str = jovVar.f().b();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        String e = jql.e(str);
        Level o = jovVar.o();
        if (!this.b) {
            int d = jql.d(o);
            if (!Log.isLoggable(e, d) && !Log.isLoggable("all", d)) {
                return;
            }
        }
        jqk.e(jovVar, e, 2, this.a, this.c, this.d);
    }

    @Override // defpackage.jow
    public final boolean d(Level level) {
        return true;
    }
}
