package unlekker.modelbuilder;

public class UIntersections {
	public enum intersectionType {
		NONE, POINT, LINE, TRIANGLE, TRIANGLES
	}
	public class UIntersectionObject {
		public intersectionType type;

		public UIntersectionObject(){
			type = NONE;
		}

		public UIntersectionObject(intersectionType t){
			type = t;
		}

		public boolean isEmpty(){
			return type == NONE;
		}

		public UVec3 getPoint(){
			if (isEmpty()) {
				//FIXME: this code is awful
				throw new EmptyIntersectionException();
			} else {
				//TODO: output one cannonical point
				/* 
					if plane, return normal. If line, return edge closer to origin.
				*/
				return new 
		}


		public class EmptyIntersectionException extends Exception{

		}
	}


	// Library needs to be restructured.

	public static UIntersectionObject linePlaneIntersection(UVec3 pt1,UVec3 pt2, UVec3 planePt, UVec3 planeN) {
		UIntersectionObject intersection = new UIntersectionObject()
				
	  //http://paulbourke.net/geometry/planeline/

		return intersection;
	}
}


