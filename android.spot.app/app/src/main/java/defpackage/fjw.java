package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjw extends ag implements fjk {
    public static final WeakHashMap a = new WeakHashMap();
    private final mjp b = new mjp();

    @Override // defpackage.ag
    public final void V(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.V(str, fileDescriptor, printWriter, strArr);
        this.b.k();
    }

    @Override // defpackage.ag
    public final void Y(int i, int i2, Intent intent) {
        super.Y(i, i2, intent);
        this.b.c(i, i2, intent);
    }

    @Override // defpackage.fjk
    public final Activity a() {
        return E();
    }

    @Override // defpackage.ag
    public final void ab() {
        super.ab();
        this.b.e();
    }

    @Override // defpackage.ag
    public final void af() {
        super.af();
        this.b.f();
    }

    @Override // defpackage.fjk
    public final void b(fjj fjjVar) {
        this.b.j(fjjVar);
    }

    @Override // defpackage.fjk
    public final fjj c(Class cls) {
        return this.b.l(cls);
    }

    @Override // defpackage.ag
    public final void g(Bundle bundle) {
        super.g(bundle);
        this.b.d(bundle);
    }

    @Override // defpackage.ag
    public final void j(Bundle bundle) {
        this.b.g(bundle);
    }

    @Override // defpackage.ag
    public final void k() {
        super.k();
        this.b.h();
    }

    @Override // defpackage.ag
    public final void l() {
        super.l();
        this.b.i();
    }
}
