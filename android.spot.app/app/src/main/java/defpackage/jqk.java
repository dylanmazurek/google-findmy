package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqk extends jpx {
    public static final Set a;
    public static final jph b;
    public static final jqi c;
    private final String d;
    private final Level e;
    private final Set f;
    private final jph g;
    private final int h;

    static {
        Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(jnn.a, jop.a, joq.a)));
        a = unmodifiableSet;
        jph a2 = jpk.a(unmodifiableSet);
        b = a2;
        c = new jqi(2, Level.ALL, false, unmodifiableSet, a2);
    }

    public jqk(String str, int i, Level level, Set set, jph jphVar) {
        super(str);
        this.d = jql.e(str);
        this.h = 2;
        this.e = level;
        this.f = set;
        this.g = jphVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0204  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(defpackage.jov r19, java.lang.String r20, int r21, java.util.logging.Level r22, java.util.Set r23, defpackage.jph r24) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqk.e(jov, java.lang.String, int, java.util.logging.Level, java.util.Set, jph):void");
    }

    @Override // defpackage.jow
    public final void c(jov jovVar) {
        e(jovVar, this.d, 2, this.e, this.f, this.g);
    }

    @Override // defpackage.jow
    public final boolean d(Level level) {
        String str = this.d;
        int d = jql.d(level);
        if (!Log.isLoggable(str, d) && !Log.isLoggable("all", d)) {
            return false;
        }
        return true;
    }
}
