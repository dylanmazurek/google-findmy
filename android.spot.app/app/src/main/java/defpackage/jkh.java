package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jkh implements Iterator {
    public static final jkh a;
    private static final /* synthetic */ jkh[] b;

    static {
        jkh jkhVar = new jkh();
        a = jkhVar;
        b = new jkh[]{jkhVar};
    }

    private jkh() {
    }

    public static jkh[] values() {
        return (jkh[]) b.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        hwx.C(false);
    }
}
