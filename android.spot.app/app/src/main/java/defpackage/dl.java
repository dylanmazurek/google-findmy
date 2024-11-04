package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dl {
    final int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    public gh h;
    gd i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    boolean n = false;
    boolean o;
    Bundle p;

    public dl(int i) {
        this.a = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(gh ghVar) {
        gd gdVar;
        gh ghVar2 = this.h;
        if (ghVar != ghVar2) {
            if (ghVar2 != null) {
                ghVar2.m(this.i);
            }
            this.h = ghVar;
            if (ghVar != null && (gdVar = this.i) != null) {
                ghVar.g(gdVar);
            }
        }
    }
}
