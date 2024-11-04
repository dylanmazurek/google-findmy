package defpackage;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class jyp {
    public static final jyp a;
    public static final Set b;
    private static final /* synthetic */ jyp[] c;

    static {
        jyp jypVar = new jyp();
        a = jypVar;
        c = new jyp[]{jypVar};
        b = new CopyOnWriteArraySet();
    }

    private jyp() {
    }

    public static jyp[] values() {
        return (jyp[]) c.clone();
    }
}
