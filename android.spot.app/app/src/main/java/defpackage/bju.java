package defpackage;

import android.graphics.Matrix;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import java.util.ArrayList;

/* compiled from: PG */
@mkp
/* loaded from: classes.dex */
public final class bju {
    public final View a;

    public bju(View view, byte[] bArr) {
        this.a = view;
        mkm.a(3, new azp(this, 9));
    }

    public bju(View view) {
        new bju(view, null);
        Choreographer.getInstance();
        this.a = view;
        new bjs(new bfs(""), bgl.a);
        int i = bjr.a;
        new ArrayList();
        mkm.a(3, new azp(this, 10));
        new CursorAnchorInfo.Builder();
        arb.e();
        new Matrix();
    }
}
