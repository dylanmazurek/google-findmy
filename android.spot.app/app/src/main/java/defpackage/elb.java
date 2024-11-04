package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class elb implements DialogInterface.OnClickListener {
    private final /* synthetic */ int a;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
            if (i2 != 5) {
                dialogInterface.dismiss();
            } else {
                dialogInterface.dismiss();
            }
        }
    }
}
