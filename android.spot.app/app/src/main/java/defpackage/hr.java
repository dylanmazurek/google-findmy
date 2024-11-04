package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hr extends kn {

    @ViewDebug.ExportedProperty
    public boolean a;

    @ViewDebug.ExportedProperty
    public int b;

    @ViewDebug.ExportedProperty
    public int c;

    @ViewDebug.ExportedProperty
    public boolean d;

    @ViewDebug.ExportedProperty
    public boolean e;
    public boolean f;

    public hr() {
        super(-2);
        this.a = false;
    }

    public hr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public hr(hr hrVar) {
        super((ViewGroup.LayoutParams) hrVar);
        this.a = hrVar.a;
    }

    public hr(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
