package defpackage;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class l extends q {
    private final boolean b;
    private boolean c;
    private bfi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ca caVar, boolean z) {
        super(caVar);
        caVar.getClass();
        this.b = z;
    }

    public final bfi a(Context context) {
        boolean z;
        if (this.c) {
            return this.d;
        }
        ca caVar = this.a;
        if (caVar.h == 2) {
            z = true;
        } else {
            z = false;
        }
        bfi ac = a.ac(context, caVar.a, z, this.b);
        this.d = ac;
        this.c = true;
        return ac;
    }
}
