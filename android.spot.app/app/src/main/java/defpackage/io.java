package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class io implements DialogInterface.OnClickListener, it {
    cq a;
    final /* synthetic */ iu b;
    private ListAdapter c;
    private CharSequence d;

    public io(iu iuVar) {
        this.b = iuVar;
    }

    @Override // defpackage.it
    public final int a() {
        return 0;
    }

    @Override // defpackage.it
    public final int b() {
        return 0;
    }

    @Override // defpackage.it
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.it
    public final CharSequence d() {
        return this.d;
    }

    @Override // defpackage.it
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.it
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.it
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.it
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.it
    public final void i(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.it
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.it
    public final void k(int i, int i2) {
        if (this.c == null) {
            return;
        }
        cp cpVar = new cp(this.b.a);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            cpVar.k(charSequence);
        }
        ListAdapter listAdapter = this.c;
        iu iuVar = this.b;
        cl clVar = cpVar.a;
        int selectedItemPosition = iuVar.getSelectedItemPosition();
        clVar.q = listAdapter;
        clVar.r = this;
        clVar.u = selectedItemPosition;
        clVar.t = true;
        cq b = cpVar.b();
        this.a = b;
        ListView listView = b.a.f;
        listView.setTextDirection(i);
        listView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.it
    public final void m() {
        cq cqVar = this.a;
        if (cqVar != null) {
            cqVar.dismiss();
            this.a = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.setSelection(i);
        if (this.b.getOnItemClickListener() != null) {
            this.b.performItemClick(null, i, this.c.getItemId(i));
        }
        m();
    }

    @Override // defpackage.it
    public final boolean x() {
        cq cqVar = this.a;
        if (cqVar != null) {
            return cqVar.isShowing();
        }
        return false;
    }
}
