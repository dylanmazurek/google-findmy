package defpackage;

import android.view.DragEvent;
import android.view.View;
import defpackage.aow;
import defpackage.bcl;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bcl implements View.OnDragListener {
    public final apm a = new apm(bas.h);
    public final rz b = new rz((byte[]) null);
    public final aox c = new azf() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        @Override // defpackage.azf
        public final /* bridge */ /* synthetic */ aow d() {
            return bcl.this.a;
        }

        @Override // defpackage.azf
        public final /* bridge */ /* synthetic */ void e(aow aowVar) {
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return bcl.this.a.hashCode();
        }
    };

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        bet betVar = new bet(dragEvent);
        boolean z = false;
        switch (dragEvent.getAction()) {
            case 1:
                apm apmVar = this.a;
                mpk mpkVar = new mpk();
                fr.d(apmVar, new ud(betVar, apmVar, mpkVar, 6));
                z = mpkVar.a;
                ry ryVar = new ry(this.b);
                while (ryVar.hasNext()) {
                }
                return z;
            case 2:
                this.a.e(betVar);
                return false;
            case 3:
                return false;
            case 4:
                this.a.c(betVar);
                return false;
            case 5:
                return false;
            case 6:
                this.a.d(betVar);
                return false;
            default:
                return z;
        }
    }
}
