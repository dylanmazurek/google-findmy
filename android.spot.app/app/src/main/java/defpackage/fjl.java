package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjl extends Fragment implements fjk {
    public static final WeakHashMap a = new WeakHashMap();
    private final mjp b = new mjp();

    @Override // defpackage.fjk
    public final Activity a() {
        return getActivity();
    }

    @Override // defpackage.fjk
    public final void b(fjj fjjVar) {
        this.b.j(fjjVar);
    }

    @Override // defpackage.fjk
    public final fjj c(Class cls) {
        return this.b.l(cls);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.b.k();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.b.c(i, i2, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.b.d(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.b.e();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.b.f();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.b.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.b.h();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.b.i();
    }
}
