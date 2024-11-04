package defpackage;

import android.view.ViewStructure;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apd {
    public static final apd a = new apd();

    private apd() {
    }

    public final int a(ViewStructure viewStructure, int i) {
        int addChildCount;
        addChildCount = viewStructure.addChildCount(i);
        return addChildCount;
    }

    public final ViewStructure b(ViewStructure viewStructure, int i) {
        ViewStructure newChild;
        newChild = viewStructure.newChild(i);
        return newChild;
    }

    public final void c(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
        viewStructure.setDimens(i, i2, i3, i4, i5, i6);
    }

    public final void d(ViewStructure viewStructure, int i, String str, String str2, String str3) {
        viewStructure.setId(i, str, str2, str3);
    }
}
