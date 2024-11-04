package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public class od extends Dialog implements cfc, oy, cjz {
    private cex a;
    public final ox b;
    private final drz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od(Context context, int i) {
        super(context, i);
        context.getClass();
        this.c = new drz(this);
        this.b = new ox(new nl(this, 6));
    }

    private final cex a() {
        cex cexVar = this.a;
        if (cexVar == null) {
            cex cexVar2 = new cex(this);
            this.a = cexVar2;
            return cexVar2;
        }
        return cexVar;
    }

    public static final void g(od odVar) {
        super.onBackPressed();
    }

    @Override // defpackage.cfc
    public final cex N() {
        return a();
    }

    @Override // defpackage.cjz
    public final cjy R() {
        return (cjy) this.c.b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.addContentView(view, layoutParams);
    }

    @Override // defpackage.oy
    public final ox c() {
        return this.b;
    }

    public final void f() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        bty.e(decorView, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        ix.b(decorView2, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        bza.d(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.b.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            ox oxVar = this.b;
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            oxVar.e(onBackInvokedDispatcher);
        }
        this.c.e(bundle);
        a().b(cev.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.c.f(onSaveInstanceState);
        return onSaveInstanceState;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        a().b(cev.ON_RESUME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onStop() {
        a().b(cev.ON_DESTROY);
        this.a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        f();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        f();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        f();
        super.setContentView(view, layoutParams);
    }
}
