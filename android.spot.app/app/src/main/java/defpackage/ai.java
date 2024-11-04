package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ai extends an implements bqy, bqz, bv, bw, cgq, oy, pl, cjz, bh, buz {
    final /* synthetic */ aj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar) {
        super(ajVar, ajVar, new Handler());
        this.a = ajVar;
    }

    @Override // defpackage.cfc
    public final cex N() {
        return this.a.d;
    }

    @Override // defpackage.cjz
    public final cjy R() {
        return this.a.R();
    }

    @Override // defpackage.an, defpackage.al
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.cgq
    public final ddh aE() {
        return this.a.aE();
    }

    @Override // defpackage.an, defpackage.al
    public final boolean b() {
        Window window = this.a.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.oy
    public final ox c() {
        return this.a.c();
    }

    @Override // defpackage.pl
    public final pk d() {
        return this.a.h;
    }

    @Override // defpackage.an
    public final void e() {
        this.a.invalidateOptionsMenu();
    }

    @Override // defpackage.bh
    public final void f() {
    }
}
